package class15;

import java.util.Scanner;

public class replitStringBanana {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str1=scan.next();

        String str3Letters=str1.substring(0,3);

        System.out.println("The first 3 letters of banana is "+str3Letters);


    }
}
