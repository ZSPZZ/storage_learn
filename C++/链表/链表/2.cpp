#include <iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define OVERFLOW -2
//Status�Ǻ�������ֵ���ͣ���ֵ�Ǻ������״̬����
typedef int Status;


typedef struct {
	int x;
	int y;
}Point;

typedef struct {
	Point *s;//����ռ�Ļ���ַ
	int length;//����ʽ��ǰ��ĸ���
}SqList;//����ʽ��˳�򴢴�ṹ����ΪSqList

Status InitList(SqList& L) {
	//����һ���յ�˳���
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