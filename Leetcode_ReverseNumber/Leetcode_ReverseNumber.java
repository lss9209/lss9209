import java.util.Scanner;

public class Leetcode_ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int a = scanner.nextInt();
		System.out.print(reverseNumber(a));
		System.out.println("");
	}
	public static int reverseNumber(int n) {
		int num = n;
		int sum = 0;
		if(num >= 0) {
			while(num > 0) {
				int a = (num % 10);
				sum = sum*10 + a;
				num /= 10;
			}
		return sum;
		}
		else num *= (-1);
			while(num > 0) {
				int a = (num % 10);
				sum = sum*10 + a;
				num /= 10;
			}
		return sum*(-1);
	}
}
