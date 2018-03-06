#include <iostream>
#include <stdio.h> /* printf, scanf, NULL */
#include <stdlib.h> /* malloc, free, rand */

using namespace std;

typedef struct Doro{
	int age;
	char* name;	
} Person;

int main(int argc, char** argv){
//int *pi = (int*)malloc(sizeof(int));
//*pi = 5;
//printf("*pi: %d\n", *pi);
//free(pi);

	Person *stuff = (Person*)malloc(sizeof(Person));	
	(*stuff).age = 50;	
	printf("%d\n", (*stuff).age);
	return 0;
}
