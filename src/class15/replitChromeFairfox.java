package class15;

import java.util.Scanner;

public class replitChromeFairfox {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (str.equalsIgnoreCase("CHROME")) {
            System.out.println("Proceed with Chrome browser");
        } else if (str.equalsIgnoreCase("FIREFOX")) {
            System.out.println("Proceed with Firefox browser");
        } else if (str.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }

    }
}

