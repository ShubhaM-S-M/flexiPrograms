public class Casting
{
	public static void main(String[] args)
	{
		int intA=10;
		float floatA=intA;
		System.out.println("Wide casting:");
		System.out.println("a="+intA);
		System.out.println("a="+floatA);
		
		float floatB=10.5f;
		int intB=(int)floatB;
		System.out.println("Narrow casting:");
		System.out.println("b="+floatB);
		System.out.println("b="+intB);		
	}
}