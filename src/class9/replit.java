package class9;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number1 = scan.nextInt();
        int number2=scan.nextInt();
        int number3=scan.nextInt();


        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is " + number3);

        }
    }
}