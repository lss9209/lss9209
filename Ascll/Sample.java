import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int korean, english, math;

        System.out.print("input korean : ");
        korean = scanner.nextInt();
       
        System.out.print("input english : ");
        english = scanner.nextInt();
        
        System.out.print("input math : ");
        math = scanner.nextInt();

        int total = korean + english +math;
        System.out.println("total score : " + total);
        System.out.println("avg score : "+ total/3.0);

        int avg = (int)(total/3.0 * 100 + 0.5);
         System.out.println("Average2 : " + avg/100.0);
         System.out.format("Average3 : %.2f\n", total / 3.0);
    }
}
