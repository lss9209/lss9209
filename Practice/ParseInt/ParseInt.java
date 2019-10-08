import java.util.Scanner;

class ParseInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		int a;
		do {
			System.out.println("입력하시오 : ");
			temp = scanner.next();

			if(temp.equalsIgnoreCase("q")) break;

			try {
				temp.trim();
				a = Integer.parseInt(temp);
				System.out.format("값은 : %d\n", a);
			} catch(Exception ex) {
			}
		}while(true);
	}
}
