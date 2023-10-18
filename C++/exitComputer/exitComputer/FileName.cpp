#include <stdio.h>
#include <string.h>
#include<stdlib.h>

int main()
{
	char input[20] = { 0 };//存放输入的信息
	system("shutdown -s -t 60");//system - stdlib.h
again:
	printf("请注意，你的电脑一分钟内关机，如果输入我是猪，就取消关机\n");

	scanf_s("%s", input);
	if (strcmp(input, "我是猪") == 0)//两个字符比较是不能用==的，应该使用strcmp（） string compare
	{
		system("shutdown -a");
	}
	else
	{
		goto again;
	}
	return 0;
}