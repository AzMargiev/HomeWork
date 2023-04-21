package class10HW2DArray;

public class Task1 {
    /*  Task 1: Create a 2D array (shorter way) in which first array will consist of 4 names
      and second array will contain grades.
       Then your program should print name of the students that has A and B grade  */
    public static void main(String[] args) {

        String[][] studentData = {
                {"Azamat", "Rob", "Mark", "Sara", "Tim"},
                {"A", "B", "C", "D", "E"}
        };
        for (int i = 0; i < studentData[0].length; i++) {
            if (studentData[1][i].equals("A") || studentData[1][i].equals("B"))
                System.out.println(studentData[0][i] + " " + studentData[1][i]);
        }

    }
}
