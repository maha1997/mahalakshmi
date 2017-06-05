#include<stdio.h>
#include<conio.h>
void main()
{
int number;
printf("enter the number\n");
scanf("%d",&number);
if(number>=0)
printf("%d is a positive number\n",number);
else if(number<=0)
printf("% is a negative number\n",number);
else
printf("%d is a zero\n",number);
}
