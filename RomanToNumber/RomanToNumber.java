import java.util.Scanner;

class RomanToNumber {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Input roman number: " );
        String roman = scanner.next();

        System.out.println("Roman number: " + roman);
        System.out.println("toLowerCase : " + roman.toLowerCase());
        System.out.println("toUpperCase : " + roman.toUpperCase());

        if (roman.equalsIgnoreCase("I")) {
            System.out.println("number 1");
        } else if (roman.equalsIgnoreCase("II")) {
            System.out.println("number 2");
        } else if (roman.equalsIgnoreCase("III")) {
            System.out.println("number 3");
        } else if (roman.equalsIgnoreCase("IV")) {
            System.out.println("number 4");
        } else if (roman.equalsIgnoreCase("V")) {
            System.out.println("number 5");
        } else if (roman.equalsIgnoreCase("VI")) {
            System.out.println("number 6");
        } else if (roman.equalsIgnoreCase("VII")) {
            System.out.println("number 7");
        } else if (roman.equalsIgnoreCase("VIII")) {
            System.out.println("number 8");
        } else if (roman.equalsIgnoreCase("IX")) {
            System.out.println("number 9");
        } else if (roman.equalsIgnoreCase("X")) {
            System.out.println("number 10");
        } else {
            System.out.println("Invalid roman");
        }
        /*
        String str1 = "BCDEF";
        String str2 = "abcde";
        System.out.println(str1.compareTo(str2));
    
        if(roman == "I") {
            System.out.println("number 1");
        } else if (roman == "II") {
            System.out.println("number 2");
        } else if (roman == "III") {
            System.out.println("number 3");
        } else if (roman == "IV") {
            System.out.println("number 4");
        } else if (roman == "V") {
            System.out.println("number 5");
        } else if (roman == "VI") {
            System.out.println("number 6");
        } else if (roman == "VII") {
            System.out.println("number 7");
        } else if (roman == "VIII") {
            System.out.println("number 8");
        } else if (roman == "IX") {
            System.out.println("number 9");
        } else if (roman == "X") {
            System.out.println("number 10");
        }
        */
    }
}
