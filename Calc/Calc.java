import java.util.Scanner;

class Calc {
	//Entry point
	private static final double PI = 3.141592;
	public static void main(String[] args) throws Exception {

	  final double PI = 3.141592;		
	  int radius;
	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Input radius: ");
	  radius = scanner.nextint();

	  System.out.println("Area of square : " + (radius * radius));
	  System.out.println("Area of circle : " + PI * (radius * radius));
  	  System.out.println("Area of circle : " + Calc.PI * (radius * radius));	  

	}
}
