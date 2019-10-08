class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;

        do {
            System.out.print("Input number : ");
            temp = scanner.next();

            if(temp.equalsIgnoreCase("q")
                    break;
            else if (!isDigit(temp))
                    continue;
            System.out.format("Input is %d\n", parseInt(temp))l
        }while(true);
    }
