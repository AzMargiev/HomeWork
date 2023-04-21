package class10HW2DArray;

public class Task5 {
    public static void main(String[] args) {
         /*Task 5: Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.*/

        int [][] numbers={
                {12,16,17,13},
                {10,11,17,20},
                {19,20,20,11}
        };
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }



    }
}
