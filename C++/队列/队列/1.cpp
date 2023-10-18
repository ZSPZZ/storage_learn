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

//��ʼ������
Status InitQueue(SqQueue &Q)
{//����һ���ն���
	Q.base = new QElemType { MAXQSIZE };//Ϊ���з���һ���������ΪMAXQSIZE������ռ�
	if (!Q.base) exit(OVERFLOW);//�������ʧ��
	Q.front = Q.rear = 0;//ͷָ���βָ����Ϊ�㣬����Ϊ��
	return OK;
}

//����г���
int QueueLength(SqQueue Q)
{//����Q��Ԫ�ظ����������еĳ���
	return (Q.rear - Q.front + MAXQSIZE) % MAXQSIZE;
}

//���
Status EnQueue(SqQueue& Q, QElemType e)
{//����Ԫ��eΪQ���µĶ�βԪ��
	if ((Q.rear + 1) % MAXQSIZE == Q.front)//βָ����ѭ�������ϼ�1�����ͷָ�룬��������
		return ERROR;
	Q.base[Q.rear] = e;
	Q.rear = (Q.rear + 1) % MAXQSIZE;
	return OK;
}

//����
Status DeQueue(SqQueue& Q, QElemType& e)
{//ɾ��Q�Ķ�ͷԪ�أ���e������ֵ
	if (Q.front == Q.rear) return ERROR;//�ӿ�
	e = Q.base[Q.front];
	Q.front = (Q.front + 1 % MAXQSIZE);
	return OK;
}

//ȡ��ͷԪ��
SElemType GetHead(SqQueue Q)
{//����Q�Ķ�ͷԪ�أ����޸Ķ�ͷָ��
	if (Q.front != Q.rear)//���зǿ�
		return Q.base[Q.front];//���ض�ͷԪ�ص�ֵ,��ͷָ�벻��
}