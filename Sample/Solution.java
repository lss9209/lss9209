import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = "*";
        String n = scanner.next();
        n.trim();
        for(int i = 0; i < n.length; i++) {
            if(character.isDigit(n.charAt(i) == false) 
        for(int i = 1; i <= n; i++) {
            System.out.format(String.format("%%%ds\n",n), str);
            str += "*";
        }
        else System.out.println("정수가 아닌 문자를 입력하면 안됩니다.");
    
       /*
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10 - i; j++) {
                System.out.format(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.format("*");
            }
            System.out.println("");
        }*/

       /* for(int i = 2; i <= 9 ; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.format("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println("");
        }*/
       /* Scanner scanner = new Scanner(System.in);
       //int x = scanner.nextInt();
    int[] primeNumbers = new int[100];
    int count = 0;

    for (int x = 2; x <= 100; x++) {
        boolean isPrime = true;

        for(int i = 0; i < count; i++) {
            if(x % primeNumbers[i] == 0) {
                isPrime = false;
                break;
            }
        }
    if(isPrime) {
        primeNumbers[count] = x;
        count++;
    System.out.println(x + "는 " + (isPrime ? "소수이다" : "소수가 아니다");*/
    }
}
        
