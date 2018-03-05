#include <opencv2/opencv.hpp>

using namespace cv;

int main( int argc, char** argv ) {

  // Load an image specified on the command line.
  Mat image = imread(argv[1], 1);

  // Create some windows to show the input
  // and output images in.
  //
  namedWindow( "Example 2-5-in", WINDOW_AUTOSIZE );
  namedWindow( "Example 2-5-out", WINDOW_AUTOSIZE );

  // Create a window to show our input image
  imshow( "Example 2-5-in", image );

  waitKey(0);

  // Create an image to hold the smoothed output
  Mat out;

  // Do the smoothing
  // ( Note: Could use GaussianBlur(), blur(), medianBlur() or bilateralFilter(). )
  GaussianBlur(image, out, Size(5,5), 3, 3);
  GaussianBlur(out, out, Size(5,5), 3, 3);

  // Show the smoothed image in the output window
  //
  imshow( "Example 2-5-out", out );

  // Wait for the user to hit a key, windows will self destruct
  waitKey( 0 );

}
