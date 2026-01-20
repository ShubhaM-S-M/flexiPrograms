import java.util.*;
public class RectangleArea
{
	public static void main(String[] args)
	{
		int len, br, area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length :");
		len=sc.nextInt();
		System.out.println("Enter breadth :");
		br=sc.nextInt();
		area=len*br;
		System.out.println("Area="+area);
	}
}