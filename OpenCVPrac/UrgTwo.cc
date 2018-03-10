#include<opencv2/core/core.hpp>
#include<opencv2/highgui/highgui.hpp>
#include<opencv2/imgproc/imgproc.hpp>
#include<opencv2/ml/ml.hpp>
#include <opencv2/opencv.hpp>
#include <vector>

using namespace cv;
using namespace std;

int main(int argc, char** argv){
  vector<vector<Point> > ptContours;
  vector<Vec4i> v4iHierarchy; // Still have no clue what this is for.

  Mat rgbImg = imread(argv[1], 1);
  if(rgbImg.empty()){return -1;};
  Mat imgGray;
  Mat imgBlurr;
  Mat imgThresh;
  Mat contourImg;

  cvtColor(rgbImg, imgGray, CV_BGR2GRAY);
  GaussianBlur(imgGray, imgBlurr, Size(5, 5), 0);
  adaptiveThreshold(imgBlurr, imgThresh, 255, ADAPTIVE_THRESH_GAUSSIAN_C, THRESH_BINARY_INV, 21, 0);
  findContours(imgThresh, ptContours, v4iHierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE);

  //namedWindow("Sample", WINDOW_NORMAL);
  imshow("Sample", imgThresh);
  waitKey(0);
  return 0;
}
