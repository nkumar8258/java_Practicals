
public class Sum1
{
public static void main(String args[])
{
int b=Integer.parseInt(args[0]);
int n;
for(int i=1;i<args.length;i++)
{
n=Integer.parseInt(args[i]);
b=b+n;
}
System.out.println("Sum is "+b);
}
}
