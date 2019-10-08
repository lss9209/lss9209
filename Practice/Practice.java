import java.util.Scanner;

class Practice {
	public static void main(String[] args) {
		do{
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		String pattern = "*";
		n.trim();
        int i;
		if(n.equalsIgnoreCase("exit")) break;
		
		for(i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i)) == false) {
		 System.out.println("적절하지 못한 숫자입니다.");
		 break;
		}	
	    }
		if(i == (n.length())) {
			 for(int j = 1; j <= Integer.parseInt(n); j++) {
			System.out.format(String.format("%%%ds\n", Integer.parseInt(n)), pattern);
			pattern += "*";
			 }
		}
		
		}while(true);	
	}
}

