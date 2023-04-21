package class10;
/*Task 2: Create an array of names and store all names of your group.
       Then print your name from that array. (use 2 different ways of creating an array).*/
public class Task2 {
    public static void main(String[] args) {

        String [] names={"Azamat", "Aslan", "Asel", "Sumair", "Andrew", "Engracia", "Sia", "Katerina"};
        System.out.println(names[0]);

        String [] names2=new String[8];

        names2[0]="Azamat";
        names2[1]="Aslan";
        names2[2]="Asel";
        names2[3]="Sumair";
        System.out.println(names2[0]);
    }
}
