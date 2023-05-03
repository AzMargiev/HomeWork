package class15;

public class replitStringMethodReplace {
    public static void main(String[] args) {

        String given="Hello Syntax friends";
        String newStr=given.replace("Hello", "Welcome")
                        .replace("friends", "family");


        System.out.println(newStr);
    }
}
