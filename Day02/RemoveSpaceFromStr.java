package Day02;

public class RemoveSpaceFromStr {
    public static void main(String[] args) {
        String str = "Hi Friends! This is string";
        String removeSpace = str.replaceAll("\\s", "");

        System.out.println("Origional string is :"+ str);
        System.out.println("After removing space element is :"+ removeSpace);
    }
}
