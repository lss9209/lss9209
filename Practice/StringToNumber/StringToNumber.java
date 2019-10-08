import java.util.Scanner;

class StringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;
        do {System.out.println("입력하시오 : ");
            temp = scanner.next();
            if(temp.equalsIgnoreCase("q")) break;
            if(!isDigit(temp)) continue;
            System.out.format("값은 %d\n ",parseInt(temp));
            

        }while(true);
    }
    public static boolean isDigit(String str) {
        if(str == null)
            return false;

        boolean isDigit = true;

        for(int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                isDigit = false;
                return isDigit;
            }
        }
        return isDigit;
    }

    public static Integer parseInt(String str) {
        if(str == null)
            return null;

        str.trim(); int number = 0;
        
        for(int i = 0; i <str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return null;
        }
    }
        for(int j = 0; j <str.length(); j++) {
            number = number*10 + (str.charAt(j) - '0');           
        }
        return number;        
    }
}

