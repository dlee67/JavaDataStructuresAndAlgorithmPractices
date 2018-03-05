#include <opencv2/opencv.hpp>
#include <iostream>
#include <unistd.h>
#include <stdio.h>

using namespace std;
using namespace cv;

int main( int argc, char** argv) {
	//namedWindow("Video Footage", WINDOW_NORMAL);
	//namedWindow("Gray Footage", WINDOW_NORMAL);
	namedWindow("Canny Footage", WINDOW_NORMAL); //Prepares a window, which should display a frame that went through a Canny detection.
	Mat frame, img_gry, img_cny;
	VideoCapture cap;
	if(argc < 2){
		cap.open(0);
	}else{
		cap.open(string(argv[1]));
	}

	while(1){
		cap >> frame; // Assuming frame is a Mat.
		cvtColor(frame, img_gry, COLOR_BGR2GRAY); // Converts the captured frame into a grey image.
		Canny(img_gry, img_cny, 35, 50, 3, true); // Applies Canny edge detection to the greyed out image.
		imshow("Canny Footage", img_cny); // Display the Cannied image.
		if(waitKey(33)  >= 0){ // What's the differenced between the waitKey(0) and waitKey(33)?
			break;
		}	
	}
	 
	return 0;
}
