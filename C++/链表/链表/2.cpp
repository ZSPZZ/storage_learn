#include <iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define OVERFLOW -2
//Status是函数返回值类型，其值是函数结果状态代码
typedef int Status;


typedef struct {
	int x;
	int y;
}Point;

typedef struct {
	Point *s;//储存空间的基地址
	int length;//多项式当前项的个数
}SqList;//多项式的顺序储存结构类型为SqList

Status InitList(SqList& L) {
	//创建一个空的顺序表
	L.s = new Point[10];
	if (!L.s) exit(OVERFLOW);
	L.length = 0;
	return OK;
}

int main() {
	//p = (int*)malloc(sizeof(int));
	Point p1;
	SqList S1;
	p1.x = 1, p1.y = 2;
	InitList(S1);
}