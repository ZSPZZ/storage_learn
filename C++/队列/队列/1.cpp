#include<iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define OVERFLOW -2
#define MAXQSIZE 100
typedef int Status;

typedef struct
{
	QElemType* base;
	int front;
	int rear;
}SqQueue;

int main()
{
	
}

//初始化队列
Status InitQueue(SqQueue &Q)
{//构造一个空队列
	Q.base = new QElemType { MAXQSIZE };//为队列分配一个最大容量为MAXQSIZE的数组空间
	if (!Q.base) exit(OVERFLOW);//储存分配失败
	Q.front = Q.rear = 0;//头指针和尾指针置为零，队列为空
	return OK;
}

//求队列长度
int QueueLength(SqQueue Q)
{//返回Q的元素个数，即队列的长度
	return (Q.rear - Q.front + MAXQSIZE) % MAXQSIZE;
}

//入队
Status EnQueue(SqQueue& Q, QElemType e)
{//插入元素e为Q的新的队尾元素
	if ((Q.rear + 1) % MAXQSIZE == Q.front)//尾指针在循环意义上加1后等于头指针，表明队满
		return ERROR;
	Q.base[Q.rear] = e;
	Q.rear = (Q.rear + 1) % MAXQSIZE;
	return OK;
}

//出队
Status DeQueue(SqQueue& Q, QElemType& e)
{//删除Q的队头元素，用e返回其值
	if (Q.front == Q.rear) return ERROR;//队空
	e = Q.base[Q.front];
	Q.front = (Q.front + 1 % MAXQSIZE);
	return OK;
}

//取队头元素
SElemType GetHead(SqQueue Q)
{//返回Q的队头元素，不修改队头指针
	if (Q.front != Q.rear)//队列非空
		return Q.base[Q.front];//返回队头元素的值,队头指针不变
}