import java.util.ArrayList;
class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println(fruits);	
		fruits.remove("Banana");
		System.out.println(fruits);
		System.out.println("Size:"+fruits.size());
		System.out.println("Contains Apple?: "+fruits.contains("Apple"));
		System.out.println(fruits.get(0));
		fruits.set(0,"Mango");
		System.out.println(fruits.get(0));
	}
}