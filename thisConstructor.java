class thisConstructor
{
	static int count=0;
	thisConstructor()//calls parametrised constructor
	{

		this("Current obj paramerterised constructor"); 
		count++;
	}
	
	thisConstructor(String msg)
	{
		System.out.println(msg);
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		thisConstructor tc=new thisConstructor();
		System.out.println(count);
	}
}
