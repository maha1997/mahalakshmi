import java.until.Scanner;
public class leap
{
public static void main(String[] args)
{
int year;
Scanner scan=new Scaner(System.in);
System.out.print("enter year");
year=scan.nextInt();
if((year%4==0) && (year%100!=0))
{
System.out.print("this is a leap year");
}
else if(year%100==0)
{
System.out.print("this is not a leap year");
}
else if(year%400==0)
{
System.out.println("this is a leap year");
}
else
{
System.out.print("this is not a leap year");
}
}
}
