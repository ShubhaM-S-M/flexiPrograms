public class test4
{
	public static void main(String[] args)
	{
		String a="10";
		System.out.println(a);
		int b=Integer.parseInt(a);
		System.out.println(b);	
		char c='a';
		int d=(int)c;
		System.out.println(d);
		d=d-10;
		c=(char)d;
		float f= Float.parseFloat("10.5");
		f=f+0.5f;
		System.out.println(f);
		System.out.println(c);
	}
}