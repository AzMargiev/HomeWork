package class10;

public class Task7 {
    public static void main(String[] args) {
// Task 7: From an array of integer elements find the largest number

        int [] num={3,1,6,8,2};
        int largeN=0;
        for (int i=0; i<=num.length-1; i++){
            if(num[i]>largeN){
                largeN=num[i];

            }
        }
        System.out.println(largeN);
        }


    }
