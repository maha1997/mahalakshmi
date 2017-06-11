import java.until.Scanner;
public class largest
{
public static void main(String[] args)
{
int a,b,c,big;
Scanner scan=new Scanner(System.in);
System.out.print("enter three numbers:");
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
big=a;
if(big<b)
{
if(b>c)
{
big=b;
}
else
{
big=c;
}
}
else if(big<c)
{
if(c>b)
{
big=c;
}
else
{
big=b;
}
else
{
big=a
}
System.out.print("largest number is "+big);
}
}

