import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;

        do {
            System.out.print("Input number : ");
            temp = scanner.next();
            temp.trim();

            if(temp.equalsIgnoreCase("q"))
                break;

            try {
                int number = Integer.parseInt(temp);
                System.out.format("Number is %d\n", number);
            } catch (Exception ex) {
                System.out.println("정수를 입력하시오.");
            }
        } while(true);
    }
}
