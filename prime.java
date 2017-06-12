public class prime
{
public static void main(String[] args)
{
int i,count=o;
int n=Integer.parseInt(args[0]);
for(i=2;i<n;i++)
{
if(n % i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println(n+"prime number");
}
else
{
System.out.println(n+"not prime number");
}
}
}
