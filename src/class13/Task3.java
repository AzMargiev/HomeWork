package class13;

public class Task3 {
    public static void main(String[] args) {

        String str="khgcktLKHVLH86143&%*^$";
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());

    }
}
