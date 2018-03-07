/*
	Failed LinkedList
*/
#include <iostream>
#include <cstdio>

using namespace std;

class Node {
	int val;
	Node *next;
	public: 
		void setVal(int x = 0){
			val = x;
		}
		int getVal(){
			return val;
		}
}

class LinkedList {
	Node* headNode;
	public:
		LinkedList(){
			headNode = new Node;
		}
		void newNode(int val){
			Node* temp = new Node;
			temp.setVal(val);
			temp.next = headNode;
			headNode = temp;
		}
		//Should do this recursivly at one point.
		void iterNode(){

			Node *temp = headNode;			

			while(1){
				cout << *temp.val << endl;
				if(*temp.next == NULL){
					break;	
				}
				temp = *temp.next
			}	
		}
}

int main(int argc, char** argv){
	LinkedList list();
	list.iterNode();	

	return 0;
}
