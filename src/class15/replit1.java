package class15;

public class replit1 {
    String breed;
    String color;
    String name;

    void bark(){
        System.out.println(this.breed+" can bark");
    }
    void run(){
        System.out.println(this.breed+" can run");
    }
    void play(){
        System.out.println(this.breed+" can play");
    }

    public static void main(String[] args) {

        replit1 husky=new replit1();
        husky.breed="Husky";
        husky.name="Max";
        husky.color="White";
        husky.bark();
        husky.run();
        husky.play();

        replit1 bul=new replit1();
        bul.breed="Bulldog";
        bul.name="Jo";
        bul.color="Brown";
        bul.bark();
        bul.run();
        bul.play();

        replit1 lab=new replit1();
        lab.breed="Labrador";
        lab.name="OPPO";
        lab.color="Black";
        lab.bark();
        lab.run();
        lab.play();


    }
}
