class HelloWorld {
	//Entry point
	public static void main(String[] args) {
	  System.out.println("Hello world!");
	  int a = 10;
	  int b = a++;
	  System.out.println("b = a++");
	  System.out.println("a = " + a);
	  System.out.println("b = " + b);
	  System.out.println("");

	  a = 10;
	  b = ++a;
	  System.out.println("b = ++a");
	  System.out.println("a = " + a);
	  System.out.println("b = " + b);
	  System.out.println("");
	}
}
