import java.util.Scanner;
                                            
class Triangle {
	//Entry point
	private static final double height =5;
	public static void main(String[] args) throws Exception {

	  final double height = 5;		
	  int baselength;
	  float half = 0.5F;
	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Input radius: ");
	  baselength = scanner.nextInt();

	  System.out.println("Area of Triangle : " + (height * baselength * half));
	}
}
