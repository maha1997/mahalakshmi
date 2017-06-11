import java.until.Scanner;
public class natural
{
public static void main(String[] args)
{
int x,i=1;
int sum=0;
System.out.print("enter the number of items:");
Scanner s=new Scanner(System.in);
x=s.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("sum of "+x+" numbers is:"+sum);
}
}
