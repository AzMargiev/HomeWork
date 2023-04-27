package class13.HW;

public class HW2 {
    public static void main(String[] args) {

        String pol = "aba";
        String reverseStr = "";

        int strEnd = pol.length();

        for (int i = strEnd - 1; i >= 0; i--) {
            reverseStr = reverseStr + pol.charAt(i);
        }

        if (pol.toLowerCase().equals(reverseStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
