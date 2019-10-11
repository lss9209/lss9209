import java.util.Scanner;

public class fibonacci {
   
    public static int fibonacci1(int n) throws IndexOutOfBoundsException {
            if(n < 0)
                throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));

            if (n == 0 || n == 1)
                return 1;

            return fibonacci1(n-2) + fibonacci1(n-1);

        }

    public static long fibonacci2(int n) throws IndexOutOfBoundsException {
        if(n < 0 || n > 100) 
            throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));

        if(n == 0 || n == 1)
            return 1L;

        long[] array = new long[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[n - 2] + array[n - 1];

    }
    


    public static void main(String[] args) {
        int a;
        do{
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a == 7) break;
        System.out.println(fibonacci2(a));
        }while(true);
    }
}
