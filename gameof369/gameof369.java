public class gameof369 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            int count = find369(i);
            if(count > 0) {
                    System.out.format("%d : ", i);
                for(int j = 0; j < count; j++) {
                    System.out.print("짝");
                }
                System.out.println("");
            }
         }
    }
    public static int find369(int number) {
        int count = 0;
        while (number > 0) {
            int temp = number % 10;
            if(temp == 3 || temp == 6 || temp == 9)
                count++;
            number /= 10;
        }
        return count;
    }
}
