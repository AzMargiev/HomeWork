package class10;

public class Task8 {
    public static void main(String[] args) {
        // Task 8: Create an array to store char values and then print those in reverse order
        char[] say={'M', 'A', 'Z', 'A'};
        for (int i=say.length-1; i>=0; i--){
            System.out.print(say[i]+" ");
        }
    }
}
