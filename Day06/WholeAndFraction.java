package Day06;

public class WholeAndFraction {
    public static void main(String[] args) {
        double num = 20.234;

        double fPart = num%1;
        double intPart = num - fPart;
        System.out.println("Origional value :"+ num);
        System.out.println("Fractional Part :"+ fPart);
        System.out.println("Integer Part :"+ (int)intPart);
    }
}
