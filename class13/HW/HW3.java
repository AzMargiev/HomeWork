package class13.HW;

public class HW3 {
    public static void main(String[] args) {

        String var="Good morning";
        String var1="Great day";

        String [] str=var.split(" ");
        String v=str[1];

        String [] str1=var1.split(" ");
        String v1=str1[1];

        System.out.println(var.replaceAll(v,v1));

    }
}
