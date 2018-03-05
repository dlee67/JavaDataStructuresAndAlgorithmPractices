#include <opencv2/opencv.hpp>
#include <iostream>
#include <unistd.h>

using namespace cv;

int main( int argc, char* argv[] ) {
	//namedWindow("Video Footage", WINDOW_NORMAL);
	//namedWindow("Gray Footage", WINDOW_NORMAL);
	namedWindow("Canny Footage", WINDOW_NORMAL); //Prepares a window, which should display a frame that went through a Canny detection.
	VideoCapture cap(0); // Opens a default camera.
	if(!cap.isOpened()){
		return -1;
	}

	Mat frame, img_rgb, img_gry, img_cny;
	for(;;){
		cap >> frame; // Assuming frame is a Mat.
		cvtColor(frame, img_gry, COLOR_BGR2GRAY); // Converts the captured frame into a grey image.
		Canny(img_gry, img_cny, 35, 50, 3, true); // Applies Canny edge detection to the greyed out image.
		//imshow("Video Footage", frame);
		//imshow("Gray Footage", img_gry);
		imshow("Canny Footage", img_cny); // Display the Cannied image.
		if(waitKey(0) >= 0){
			break;
		}	
	}

	return 0;
}
