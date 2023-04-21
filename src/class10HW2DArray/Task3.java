package class10HW2DArray;

public class Task3 {
    public static void main(String[] args) {
          /*Task 3: Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops */

        String[][] grocery = {
                {"Broccoli", "Spina", "Onion"},//veggies
                {"Banana", "Peach", "Mango"},//fruits
                {"Milk", "Cheese", "Eggs"},//dairy
                {"Nutela", "Cookie", "Candy"}//sweets
        };
        for (String[] row:grocery){
            for (String item:row){
                System.out.print(item+" ");
            }
        }

    }
}
