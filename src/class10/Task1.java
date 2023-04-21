package class10;
//Create an array of chars and store grades into it: A,B,C,D.
// Then print a grade B (use 2 different ways of creating an array).
public class Task1 {
    public static void main(String[] args) {

        char []grade={'A', 'B', 'C', 'D',};
        System.out.println(grade[1]);


        char []gradeNew=new char[4];

        gradeNew[0]='A';
        gradeNew[1]='B';
        gradeNew[2]='C';
        gradeNew[3]='D';

        System.out.println(gradeNew[1]);



    }
}
