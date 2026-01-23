import java.util.Scanner;
public class CalcIfElse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a,b,sum,sub,mul,div;
		a= sc.nextDouble();
		b=sc.nextDouble();
		char op = sc.next().charAt(0);
		System.out.println(op=='+');
		if(op=='+')
		{
			System.out.println(a+b);
		}
		if(op=='-')
		{
			System.out.println(a-b);
		}
		if(op=='*')
		{
			System.out.println(a*b);
		}
		if(op=='/')
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}