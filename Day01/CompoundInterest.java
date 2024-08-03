import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p,t,r;

        System.out.println("Enter principal amount :");
        p = sc.nextDouble();
        System.out.println("Enter Time :");
        t = sc.nextDouble();
        System.out.println("Enter rate :");
        r = sc.nextDouble();

        double ci = p*(Math.pow((1+r/100),t));

        System.out.println("Compound Interest of given amount is :"+ ci);
    }
}
