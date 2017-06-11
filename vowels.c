#include<stdio.h>
#include<conio.h>
void main()
{
char c;
int is lowercase vowel,is uppercase vowel;
printf("enter an alphabet:");
scanf("%c",&c);
is lowercase vowel=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
is uppercase vowel=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(is lowercase vowel || is uppercase vowel)
printf("%c is a vowel",c);
else
printf("%c is a consonant",c);
return 0;
