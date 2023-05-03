package class15;

public class replitStringPosition {
    public static void main(String[] args) {

        String str="abracadabra alakazam";
        String target1="dab";
        String target2="ABRA";

        int posC=str.indexOf("c");
        System.out.println(posC);

        int posSpace=str.indexOf(" ");
        System.out.println(posSpace);

        int posTarget1=str.indexOf(target1);
        System.out.println(posTarget1);

        int posABRA=str.indexOf(target2);
        System.out.println(posABRA);

    }
}
