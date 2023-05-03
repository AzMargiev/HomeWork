package class15;

import java.util.Scanner;

public class replitStringReverse {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String s=inp.nextLine();

        String reverse="";


        for (int i = s.length()-1; i >= 0; i--) {
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);

    }
}
