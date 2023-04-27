package class13.HW;
public class HW1 {
    public static void main(String[] args) {

        String input = "This is sentence i want to reverse";
        String [] strArr1=input.split(" ");

        for (int i = 0; i < strArr1.length; i++) {
            StringBuilder str2=new StringBuilder(strArr1[i]);


            System.out.print(str2.reverse()+" ");
        }

    }
}
