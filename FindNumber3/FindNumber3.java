import java.util.Scanner;

public class FindNumber3 {

    public static void main(String[] args) {
        for(Integer i = 1; i <= 100; i++) {
            if(i.toString().indexOf('3') < 0)
                continue;

            System.out.format("%d " , i);
        }
            System.out.println("");
    }
}
