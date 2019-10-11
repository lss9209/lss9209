import java.util.Scanner;

class StringToNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		do {
			System.out.println("숫자를 입력하시오 : ");
			temp = scanner.next();

			if(temp.equalsIgnoreCase("q")) break;

			if(isDigit(temp)) System.out.format("값은 : %d\n", parseInt(temp));

		}while(true);
	}
	public static boolean isDigit(String str) {
		if(str == null) return false;

		boolean isDigit = true;

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				isDigit = false;
				return isDigit;
			}
		}
		return isDigit;
	}
	public static Integer parseInt(String str) {
		if(str == null) return null;
		int number = 0;
		for(int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if(!Character.isDigit(ch)) 
				return null;
			number = (number * 10) + (ch - '0');
		}
		return number;
	}
}

