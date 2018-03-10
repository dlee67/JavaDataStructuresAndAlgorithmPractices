#include "opencv2/ximgproc/segmentation.hpp"
#include "opencv2/highgui.hpp"
#include "opencv2/core.hpp"
#include "opencv2/imgproc.hpp"
#include <iostream>
#include <ctime>
#include <vector>

using namespace std; 
using namespace cv;
using namespace cv::ximgproc::segmentation;

int main( int argc, char** argv ) {	
	  	
	setUseOptimized(true);
	setNumThreads(4);

	Mat frame, img_gry, img_cny;	
	frame = imread("TrendBird.png");
	namedWindow( "Output", WINDOW_NORMAL);
  	VideoCapture cap;

	Ptr<SelectiveSearchSegmentation> ss = createSelectiveSearchSegmentation();
   ss->setBaseImage(frame);
   ss->switchToSelectiveSearchQuality(); //After setting the image, without this, RegionalProposal doesn't work.
	
	vector<Rect> rects;
	ss->process(rects);
   cout << "Total Number of Region Proposals: " << rects.size() << endl; 		

  	while(1) {
		Mat imout = frame.clone();
    	for(int i = 0; i < rects.size(); i++){
			if(i < 100) {
				rectangle(imout, rects[i], Scalar(0, 255, 0));
			}else {
				break;
			}
		}

		imshow("Output", imout);
		if(waitKey(0)){
			break;
		}
  	}
  	return 0;
}
