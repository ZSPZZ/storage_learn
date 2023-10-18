#include <iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define TRUE 1
#define FALSE 0
#define ADD(x, y) x+y
typedef int Status;
typedef int* LinkList;

int main() 
{
	LinkList p, s;

	Status i = 2;
	cout << i << endl;
	//cin >> i;
	//cout << i << ADD(i, i);
	int numbers[10] = { 0 };
	int* np = numbers;
	int* nps[2] = { np, numbers };
	cout << np <<'\n'<< nps[0] <<'\n'<< nps[1];
}

/*void CreateListHead(LinkList* L, int n)
{

}*/

/*struct LinkList {

};*/