package class10HW2DArray;

public class Task4 {
    public static void main(String[] args) {
/*Task 4: Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.*/

        int[][] numbers = {
                {22, 40, 4},
                {10, 6, 5},
                {15, 12, 2}  //120
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];

            }
        }
        System.out.println("Sum = " + sum);
    }


}

