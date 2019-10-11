import java.util.Scanner;

class HexToNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		Integer changed_num;
		int number;
		do{
			
			temp = scanner.next();
			temp.trim();
			if(temp.equalsIgnoreCase("q")) break;
			number = 0;
			for(int i = 0; i < temp.length(); i++) {
				char ch = temp.charAt(i);
				changed_num = HexToNumber(ch);
				if(changed_num == null) {
					System.out.println("16진수를 다시 입력하시오.");
					break;
				}
				number = (number << 4) + changed_num; //괄호 없이 number << 4 + changed_num 하게되면 + 연산자가 먼저 수행되어 마치 number << (4 + changed_num) 처럼 된다. 따라서 처음 number의 값이 0이므로 0에 계속 2의 몇승을 곱하는 꼴이 돼 number는 항상 0이 된다. 이점 주의하자.	
			if(i == temp.length() -1) 
			System.out.format("10진수로 변환된 값은 : %d\n", number);
			}
			
		}while(true);
	}
	public static Integer HexToNumber(char ch) {
		if(Character.isDigit(ch)) return ch - '0';
		else if (ch == 'a' || ch =='A') return 10;
		else if (ch == 'b' || ch =='B') return 11;
		else if (ch == 'c' || ch =='C') return 12;
		else if (ch == 'd' || ch =='D') return 13;
		else if (ch == 'e' || ch =='E') return 14;
		else if (ch == 'f' || ch =='F') return 15;
		else return null;
	}

		/*
		switch (ch) {
		
		case '0' : case '1' : case '2' : case '3' : case '4' : case '5' : case '6' : case '7' : case '8' : case '9' :
		return ch -'0';

		case 'a' : case 'A' :
		return 10;

		case 'b' : case 'B' :
		return 11;

		case 'c' : case 'C' :
		return 12;

		case 'd' : case 'D' :
		return 13;

		case 'e' : case 'E' :
		return 14;

		case 'f' : case 'F' :
		return 15;

		default : return null;
			 
		}*/
	
}

