#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include<opencv2/ml/ml.hpp>

#include <iostream>
#include <vector>

const int MIN_CONTOUR_AREA = 100;
const int RESIZED_IMAGE_WIDTH = 20;
const int RESIZED_IMAGE_HEIGHT = 30;

using namespace cv;
using namespace std;

int main() {
	
	Mat imgTrainingNumbers;
	Mat imgGrayscale;
	Mat imgBlurred;
	Mat imgThresh;
	Mat imgThreshCopy;
	
	vector<vector<Point>> ptContours; // Point object is a representation of a cartesian coordinate.
	vector<Vec4i> v4iHierarchy;	// Vec4i is a template, where Vec<int, 4> is equivalent to it.

	Mat matClassificationInts;
	Mat matTrainingImagesAsFlattenedFloats;
	
	vector<int> intValidChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
											'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
											'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
											'U', 'V', 'W', 'X', 'Y', 'Z'};
	imgTrainingNumbers = imread(/*Insert the image of picture here.*/);
	if(imgTrainingNumbers.empty()){
		cout << "error: image not read from file\n\n";
		return 0;
	}

	cvtColor(imgTrainingNumbers, imgGrayscale, CV_BGR2GRAY); // convert the rgb img to grey, push it to imgGrayscale
	//For the purpose of image smoothing.
	GaussianBlur(imgGrayscale, imgBlurred, Size(5, 5), 0); // Size object specifies the size of the rectangle, where can take in Size obj.
	//The below line filters image from grayscale to black and white, bit similar to applying Canny.
	adaptiveThreshold(imgBlurred, imgThresh, ADAPTIVE_THRESH_GAUSSIAN_C, THRESH_BINARY_INV, 11, 2);
	//namedWindow("imgThresh", WINDOW_NORMAL); imshow("imgThresh", imgThresh); //For the point of reference.
	imgThreshCopy = imgThresh.clone(); //clone() creates a full copy of an Mat array.
	//
	findContours(imgThreshCopy, ptContours, v4iHierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE);
}
