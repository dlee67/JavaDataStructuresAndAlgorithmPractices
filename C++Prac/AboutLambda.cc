#include <iostream>
#include <array>
#include <algorithm>
#include <iostream>
using namespace std;

int main(){
	auto theLambda = []() {
		cout << "The Lambda" << endl;
		};

	theLambda();
}
