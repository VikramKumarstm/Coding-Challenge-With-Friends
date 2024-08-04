package Day02;

public class Dog {

    String name;
    String color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public static void main(String[] args) {
        Dog dg = new Dog("Sheru", "black");
        System.out.println("Name of dog is :"+ dg.name);
        System.out.println("Color of dog is :"+ dg.color);
    }
}
