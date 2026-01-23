public class MultiConstruct
{
	int age;
	MultiConstruct()
	{
		age=1;	
	}
	MultiConstruct(int a)
	{
		age = a;
	}
	public void disp()
	{
		System.out.println(age);	
	}
	public static void main(String[] args)
	{
		MultiConstruct mc1 = new MultiConstruct();
		MultiConstruct mc2 = new MultiConstruct(19);
		mc1.disp();
		mc2.disp();
		
	}
}