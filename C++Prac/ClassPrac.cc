#include <iostream>

using namespace std;

class Student{
	int x;
	int y;
	public:
		Student(int x_arg=0, int y_arg=0){
			x = x_arg;
			y = y_arg;
		}
		void displayNum(){
			cout << x << endl;
			cout << y << endl;
		}
		int addNums(int, int); // Acts kinda as a function prototype in the C++ class.
};

// By using the scope operator (::), I can implement the function declared, but not defined, in the class.
int Student::addNums (int x, int y){
	return x + y;
}

int main(){
	Student std(5, 7); // So, no new keyword?
	std.displayNum();
	Student std_two;
	std_two.displayNum();
	return 0;
}
