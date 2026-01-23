import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
      		Scanner scan = new Scanner(System.in);
       	int a = scan.nextInt();
	 	int b = scan.nextInt();
       	double d=scan.nextDouble();
	 	scan.nextLine();
       	String s = scan.nextLine();
	       System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Sum = "+(a+b));
    }
}