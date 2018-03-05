#include <opencv2/opencv.hpp>

using namespace cv;

int main( int argc, char** argv ) {

  Mat img = imread(argv[1],1);
  if( img.empty() ) return -1;

  namedWindow("Birb", WINDOW_NORMAL);
  imshow("Birb", img); //The second argument img comes from the Mat img = imread
  
  waitKey(0);
  destroyWindow("Birb");
}
