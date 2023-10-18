#include <iostream>
using namespace std;;
#define OK 1
#define ERROR 0
#define OVERFLOW -2
typedef int Status;

//单链表的存贮结构
typedef struct LNode//单链表中每个节点的储存结构
{
	ElemType data;//储存节点的数据域data
	struct LNode* next;//指针域next
}LNode, *LinkList;//*LinkList代表一个指向LNode结构体的指针类型，代表了struct LNode这个指针类型

//单链表的初始化
Status InitList(LinkList& L)
{
	//构造一个空的单链表
	L = new LNode;//生成新结点作为头结点
	L->next = NULL;
	return OK;
}

//取值算法
Status GetElem(LinkList L, int i, ElemType& e)
{//在带头结点的单链表L中根据序号i获取元素的值，用e返回L中第i个数据元素的值
	LNode p = new LNode;//此处new了一个空间，返回了一个指向该内存的地址。然后将返回的指针赋值给相应的指针变量类型。
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

//查找算法
LNode* LocateElem(LinkList L, Elemtype e)
{
	LNode* p = L->next;
	while (p && p->data != e) 
	{
		p = p->next;
	}
	return p;//查找成功返回值为e的结点地址，查找失败p为NULL
}

//插入算法
Status ListInsert(LinkList& L, int i, ElemType e)
{//在带头结点的单链表L中第i个位置插入值为e的新结点
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

//删除算法
Status ListDelete(LinkList& L, int i)
{//在带头结点的单链表L中，删除第i个元素
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

//创建单链表
void CreateList_H(LinkList& L, int n)
{
	//逆位序输入n个元素的值，建立带表头结点的单链表L
	L = new LNode;
	L->next = NULL;
	for (int i = 0; i < n; i++)
	{
		LinkList p = new LNode;//生成新结点*p
		cin >> (*p).data; (*p).next = L->next;//输入元素值付给新结点*p的数据域
		L->next = pow;//将新结点*p插入到头结点之后
	}
}