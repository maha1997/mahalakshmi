public class prime2
{
public static void main(String[] args)
{
int no;
System.out.println("the prime number between 10 t0 99 is");
for(no=10;no<=99;no++)
{
boolean isprime=true;
for(int j=2;j<no;j++)
{
if(no%j==0)
{
isprime=false;
break;
}
}
if(isprime)
{
System.ou.print(no+" , ");
}
}
}
}
