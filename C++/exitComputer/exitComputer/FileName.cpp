#include <stdio.h>
#include <string.h>
#include<stdlib.h>

int main()
{
	char input[20] = { 0 };//����������Ϣ
	system("shutdown -s -t 60");//system - stdlib.h
again:
	printf("��ע�⣬��ĵ���һ�����ڹػ������������������ȡ���ػ�\n");

	scanf_s("%s", input);
	if (strcmp(input, "������") == 0)//�����ַ��Ƚ��ǲ�����==�ģ�Ӧ��ʹ��strcmp���� string compare
	{
		system("shutdown -a");
	}
	else
	{
		goto again;
	}
	return 0;
}