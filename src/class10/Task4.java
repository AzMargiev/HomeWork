package class10;

//Create an array of cars and store 6 elements into it.
// Using 2 different loops print all values from the array.
public class Task4 {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Toyota", "Porsche", "Ferrari", "Chevrolet", "Ford"};
        for(int i=0; i< cars.length; i++) {
            System.out.print(cars[i] + " ");

        }
        System.out.println();

        for (String car : cars){
            System.out.print(car+" ");
        }
    }
}
