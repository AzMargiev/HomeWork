package class10;

public class Task6 {
    public static void main(String[] args) {
        // Task 6: Create an array of integers and calculate the sum of all elements in an array

        int[] n = {1, 3, 4, 2};
        int count = 0;
        for (int i = 0; i <= n.length-1; i++) {
            count += i;
            count++;
        }

        System.out.println("Sum of " + n[0] + "+" + n[1] + "+" + n[2] + "+" + n[3] + "=" + count);


    }
}
