#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include <opencv2/ml/ml.hpp>

#include <iostream>
#include <vector>

using namespace cv;
using namespace std;

int main(int argc, char** argv){
	vector< vector<Point> > contourPoints;
	namedWindow("Frame", 1);
	Mat rgbImg, grayImg, thrImg;
	rgbImg = imread(argv[1]);
	cvtColor(rgbImg, grayImg, COLOR_BGR2GRAY);
	threshold(grayImg, thrImg, 100, 255, THRESH_BINARY); 
	findContours(thrImg, contourPoints, CV_RETR_EXTERNAL, CHAIN_APPROX_SIMPLE);
	drawContours(thrImg, contourPoints, -1, Scalar::all(255));
	imshow("Frame", thrImg);
	waitKey(0);
}
