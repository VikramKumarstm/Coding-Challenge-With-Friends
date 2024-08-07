package Day05;

public class CallConstructorToOtherConstructor {

    String name;
    Integer id;

    public CallConstructorToOtherConstructor(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public CallConstructorToOtherConstructor(String name) {
        this(name, 8920);
    }
    public static void main(String[] args) {
        CallConstructorToOtherConstructor obj = new CallConstructorToOtherConstructor("sukh");

        System.out.println("Name :"+ obj.name);
        System.out.println("Id : "+ obj.id);
    }
}
