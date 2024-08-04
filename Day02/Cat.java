package Day02;

public class Cat {

    String name;
    Integer age;

    Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println("Name of cat is :"+ c1.name);
        System.out.println("Age of cat is :"+ c1.age);
    }
}
