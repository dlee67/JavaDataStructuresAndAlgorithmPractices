#include <opencv2/opencv.hpp>

int main( int argc, char** argv ) {

  cv::Mat img1,img2;

  cv::namedWindow( "Example 2-6-in", cv::WINDOW_NORMAL);
  cv::namedWindow( "Example 2-6-out", cv::WINDOW_NORMAL);

  img1 = cv::imread( argv[1] );
  cv::imshow( "Example 2-6-in", img1 );

  cv::pyrDown( img1, img2);
  cv::imshow( "Example 2-6-out", img2 );

  cv::waitKey(0);

  return 0;

}
