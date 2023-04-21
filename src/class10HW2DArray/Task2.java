package class10HW2DArray;

public class Task2 {
    public static void main(String[] args) {
/*Task 2: Create 2D array of cars: american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops*/

        String[][] cars = {
                {"American", "German",},
                {"korean", "italian"}
        };

        for(int i = 0; i<cars[0].length;i++){
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }




}
}
