package class10;

import java.util.Scanner;

public class dufghiue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Is it weekend? (true/false): ");
        boolean q1 = scan.nextBoolean();

        String subject = "";

        if (!q1) {
            subject = "manual testing";
        } else {
            subject = "Java";
        }
        System.out.println("Today you will be learning " + subject);

    }
}
//public static void main(String[] args) {

//    Scanner scan = new Scanner(System.in);
//
//    System.out.print("Is it weekend? (true/false): ");
//    boolean q1 = scan.nextBoolean();
//
//    String subject = "";
//
//    if (!q1) {
//        subject = "manual testing";
//    } else {
//        subject = "Java";
//    }
//
//    System.out.println("Today you will be learning " + subject);
//}



