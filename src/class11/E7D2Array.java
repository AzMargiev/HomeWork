package class11;

import javax.swing.plaf.IconUIResource;

public class E7D2Array {             //вывести сколько у нас falses
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        int counter = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {

                if (arr2D[i][j] == true) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

//        for (boolean[] arr1D : arr2D) {
//            for (boolean bool : arr1D) {
//
//                if (bool==false){
//                    counter++;
//                }
//            }
//        }
//       System.out.println(counter);


    }
}

