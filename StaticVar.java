public class StaticVar
{
	static int var=0;
	StaticVar()
	{
		var++;
		System.out.println("Object created. Count = "+var);
	}
	public static void main(String[] args)
	{
		StaticVar sv1= new StaticVar();
		StaticVar sv2= new StaticVar();
		StaticVar sv3 = new StaticVar();
		
		System.out.println("Final Count :"+StaticVar.var);
	}
}