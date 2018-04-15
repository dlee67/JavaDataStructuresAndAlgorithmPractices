/*
	Failed LinkedList
*/
#include <iostream>
#include <cstdio>

using namespace std;

class Node {
	public:		 
		int val;
		Node *next;
		void setVal(int x = 0){
			val = x;
		}
		int getVal(){
			return val;
		}
};

class LinkedList {
	public:	
		Node* headNode;
		LinkedList(int val){
			headNode = new Node;
			// Interchangeably, headNode->setVal could be used, which is the shorter version of whatever below.
			// Officially, -> is for accessing something beyond the pointer.
			(*headNode).setVal(val);
		}
		void newNode(int val){
			Node* temp = new Node;
			(*temp).setVal(val);
			(*temp).next = headNode;
			headNode = temp;
		}
		//Should do this recursivly at one point.
		void iterNode(Node* recur){

			Node *temp = recur;
			if(temp->next != NULL){
				cout << temp->val << endl;
				iterNode(temp->next);
			}else{
				cout << temp->val << endl;
				return;
			}
		}

		void find(Node *recur, int userSpecifiedValue){
			Node* temp = recur;
			if(temp->next != NULL){
				if(temp->val == userSpecifiedValue){
					cout << "Got it." << endl;
					return;
				}
				find(temp->next, userSpecifiedValue);
			}else{
				cout << "User spcified value wasn't able to be found." << endl;
				return;
			}
		}		

		/*
			I wonder if there is a need to "deallocate" the innitial Node object that was pointed
			by the headNode pointer.
		*/
		void pop(){
			cout << "Head node now: ";
			cout << headNode->val << endl;
			Node* temp = headNode->next;
			headNode = NULL;
			headNode = temp;
		}
};

int main(int argc, char** argv){
	LinkedList list(0);
	list.newNode(1);
	list.newNode(2);
	list.newNode(3);
	list.newNode(4);
	list.iterNode(list.headNode);	
	cout << "-------------------------------------" << endl;
	list.find(list.headNode, 4);
	list.find(list.headNode, 5);
	cout << "-------------------------------------" << endl;	
	list.pop();
	list.pop();
	list.iterNode(list.headNode);
	return 0;
}
