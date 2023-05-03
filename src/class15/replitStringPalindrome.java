package class15;

import java.util.Scanner;

public class replitStringPalindrome {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String givenString=inp.nextLine();

        givenString=givenString.toLowerCase();
        System.out.println(givenString);

        boolean isPalindrome=true;

        for (int i = 0; i < givenString.length()/2; i++) {
            if (givenString.charAt(i)!=givenString.charAt(givenString.length()-i-1)){
                isPalindrome=false;
                break;
            }
            
        }
        System.out.println(isPalindrome);
    }
}
