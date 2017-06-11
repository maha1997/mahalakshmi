import java.until.Scanner;
public class alphabet
{
public static void main(String[] args){
char ch;
Scanner scan=new Scanner(System.in);
System.out.print("enter a character:");
ch=scan.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
{
System.out.print(ch+"is an alphabet");
}
else
{
System.out.print(ch+"is not an alphabet");
}
}
}
