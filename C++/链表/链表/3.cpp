#include <iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define OVERFLOW -2
typedef int Status;

//������Ĵ����ṹ
typedef struct LNode//��������ÿ���ڵ�Ĵ���ṹ
{
	ElemType data;//����ڵ��������data
	struct LNode* next;//ָ����next
}LNode, *LinkList;//*LinkList����һ��ָ��LNode�ṹ���ָ�����ͣ�������struct LNode���ָ������

//������ĳ�ʼ��
Status InitList(LinkList& L)
{
	//����һ���յĵ�����
	L = new LNode;//�����½����Ϊͷ���
	L->next = NULL;
	return OK;
}

//ȡֵ�㷨
Status GetElem(LinkList L, int i, ElemType& e)
{//�ڴ�ͷ���ĵ�����L�и������i��ȡԪ�ص�ֵ����e����L�е�i������Ԫ�ص�ֵ
	LNode p = new LNode;//�˴�new��һ���ռ䣬������һ��ָ����ڴ�ĵ�ַ��Ȼ�󽫷��ص�ָ�븳ֵ����Ӧ��ָ��������͡�
	p = L->next;
	int j = 1;
	while (p && j < i)
	{
		p = p->next;
		j++;
	}
	if (!p || j > i) return ERROR;
	e = p->data;
	return OK;
}

//�����㷨
LNode* LocateElem(LinkList L, Elemtype e)
{
	LNode* p = L->next;
	while (p && p->data != e) 
	{
		p = p->next;
	}
	return p;//���ҳɹ�����ֵΪe�Ľ���ַ������ʧ��pΪNULL
}

//�����㷨
Status ListInsert(LinkList& L, int i, ElemType e)
{//�ڴ�ͷ���ĵ�����L�е�i��λ�ò���ֵΪe���½��
	LinkList p = new LNode;
	p = L->next;
	int j = 0;
	while (p && j < i - 1)
	{
		p = p->next;
		j++;
	}
	if (!p || j < i - 1)
	{
		return ERROR;
	}
	LNode s;
	s.data = e;
	s.next = p->next;
	p->next = &s;
	return OK;
}

//ɾ���㷨
Status ListDelete(LinkList& L, int i)
{//�ڴ�ͷ���ĵ�����L�У�ɾ����i��Ԫ��
	LinkList p = new LNode;
	p = L;
	int j = 0;
	while (p->next && j < i - 1)
	{
		p = p->next; 
		j++;
	}
	if (!p->next || j > i - 1)
	{
		return ERROR;
	}
	
	LNode* q = p->next;
	p->next = q->next;
	delete q;
	return OK;
}

//����������
void CreateList_H(LinkList& L, int n)
{
	//��λ������n��Ԫ�ص�ֵ����������ͷ���ĵ�����L
	L = new LNode;
	L->next = NULL;
	for (int i = 0; i < n; i++)
	{
		LinkList p = new LNode;//�����½��*p
		cin >> (*p).data; (*p).next = L->next;//����Ԫ��ֵ�����½��*p��������
		L->next = pow;//���½��*p���뵽ͷ���֮��
	}
}