package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        //write the logic to search if the number is present in the array or not
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 = {19, 3, 55, 789};

        int number = 89;
        int number1 = 10;
        int number2 = 11;


        ArrayUtil ivana=new ArrayUtil();
        ivana.searchArray(arr, number);
        ivana.searchArray(arr1, number1);
        ivana.searchArray(arr2, number2);

    }

    void searchArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Yes");
                break;
            }
        }
    }
}


