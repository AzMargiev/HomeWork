package class15;

import java.util.Scanner;

public class replitArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String [] names=new String[5];

        System.out.println("Please, enter 5 names");

        for (int i = 0; i < names.length; i++) {
            names[i]=scan.nextLine();
        }

        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }



    }
}
