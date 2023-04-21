package class10HW2DArray;

public class Task6 {
    public static void main(String[] args) {
/* Task 6: Create 2D array of countries:
north america countries, north america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored.*/

        String [][] countries={
                {"USA", "Canada", "Mexico"},//NorthAmerica
                {"Germany", "France", "Italia", "Norway", "Spain"},//europe
                {"China", "Japan", "India"},//asian
                {"Sudan", "Egypt", "Cameroon", "Morocco"}//africa
        };
        int sum=0;
        for (String[] each:countries){
            for (String s:each){
                System.out.print(s+" ");
                sum++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries = "+sum);

            }
        }

