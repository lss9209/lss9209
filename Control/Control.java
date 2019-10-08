import java.util.Scanner;

public class Control {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }//얘는 System.out.format("%d : %s\n", i, (i % 2 == 0 ? "짝수" : "홀수")
        }

            
        /*
         * 1부터 100 사이의 정수 중에 소수를 구하시오.
         * 소수는 0과 1을 제외한 오로지 자기 자신만으로 나눠지는 수
         * 어떤 수 n이 다른 소수로 나뉘어 지지 않는다면 소수다.
         
        int[] numbers = new int[100];
        int count = 0;
        boolean isPrime;

        for (int n = 2; n <= 100; n++) {
            isPrime = true;
            for(int i = 0; i <count; i++) {
                if(n % number[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                numbers[count] = n;
                count++;
            }
        }
        
        for(int i = 0; i < count; i++) {
            System.out.format("%d is a prime number\n", numbers[i]);
        */


        /*
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        if(a > 0) {
            System.out.println("양수");
        } else if(a < 0) {
            System.out.println("음수");
        }
        
        
        String gender = scanner.next();
        if(gender.equalsIgnoreCase("M")) {
            System.out.println("남성");
        } else if(gender.equalsIgnoreCase("F")) {
            System.out.println("여성");
        }





        
         *정수를 입력받아서
         양의 정수면 양수를 출력하고
         음의 정수면 음수를 출력하시오
         아무것도 아니면 0을 출력하는 코드를 작성해 보시오ㅗ
         */
        

    }
}
