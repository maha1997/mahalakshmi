import java.until.Scanner;
public class sum
{
public static void main(String[] args)
{
int i,n,sum=0,num;
Scanner scan=new Scanner(System.in);
System.out.print("how many number you want to enter to add them?")
n=scan.nextInt();
System.out.print("enter" +n+ "numbers:");
for(i=0;i<n;i++)
{
num=scan.nextInt();
sum=sum+num;
}
System.out.print("sum of all" +n+ "numbers is" +sum);
}
}
