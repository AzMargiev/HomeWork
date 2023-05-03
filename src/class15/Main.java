package class15;

public class Main {

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {

        Main car1=new Main();
        car1.carColor="Black";
        car1.carMake="BMW";
        car1.carYear=2019;

        Main car2=new Main();
        car2.carYear=2018;
        car2.carColor="White";
        car2.carMake="Toyota";

//Car color is Black and car year is 2019 and car model is BMW

        System.out.println("Car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);
        System.out.println("Car color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);
    }
}
