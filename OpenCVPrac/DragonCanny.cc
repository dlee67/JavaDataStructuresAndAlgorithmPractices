#include <opencv2/opencv.hpp>

using namespace std;

int main( int argc, char** argv ) {

  cv::Mat frame, img_gry, img_cny;
  cv::namedWindow( "Example 2-3", cv::WINDOW_NORMAL);
  cv::VideoCapture cap;

  if(argc >= 2){
    cap.open( string(argv[1]) );
  }else{
    cap.open(0);
  }
  for(;;) {
    cap >> frame;
    cvtColor(frame, img_gry, cv::COLOR_BGR2GRAY);
    Canny(img_gry, img_cny, 35, 50, 3, true);
    if( frame.empty() ) break;             // Ran out of film <- no, u
    cv::imshow( "Example 2-3", img_cny);
    if( (char) cv::waitKey(33) >= 0 ) break;
  }

  return 0;
}
