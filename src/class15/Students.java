package class15;

public class Students {

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students studentOne= new Students();
        studentOne.name="David";
        studentOne.id="A1221";
        Students.numberOfStudents++;

        Students studentTwo= new Students();
        studentTwo.name="Adam";
        studentTwo.id="C5545";
        Students.numberOfStudents++;

        Students studentThree= new Students();
        studentThree.name="Luiza";
        studentThree.id="M4443";
        Students.numberOfStudents++;

        System.out.println("Total number of students in class:"+Students.numberOfStudents);
    }
}