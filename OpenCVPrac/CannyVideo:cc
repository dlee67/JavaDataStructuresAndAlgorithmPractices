#include <opencv2/opencv.hpp>
#include <iostream>

using namespace cv;

int main( int argc, char* argv[] ) {
	namedWindow("Video Footage", WINDOW_NORMAL);
	namedWindow("Gray Footage", WINDOW_NORMAL);
	namedWindow("Canny Footage", WINDOW_NORMAL);
	VideoCapture cap(0);
	if(!cap.isOpened()){
		return -1;
	}

	Mat frame, img_rgb, img_gry, img_cny;
	for(;;){
		cap >> frame; // Assuming frame is a Mat.
		cvtColor(frame, img_gry, COLOR_BGR2GRAY);
		Canny(img_gry, img_cny, 35, 50, 3, true);
		imshow("Video Footage", frame);
		imshow("Gray Footage", img_gry);
		imshow("Canny Footage", img_cny);
		if(waitKey(0) >= 0){
			break;
		}	
	}

	return 0;
}
