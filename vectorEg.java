import java.util.Vector;
public class vectorEg
{
	public static void main(String[] args)
	{
		Vector<Integer> numbers = new Vector<>();		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println("Size :"+ numbers.size());
		numbers.set(0,5);
		System.out.println("At 0:"+numbers.get(0));
		
	}
}