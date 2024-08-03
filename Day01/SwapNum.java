import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before swapping first Number is :"+ num1);
        System.out.println("Before Swapping Second number is :"+ num2);

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swapping first Number is :"+ num1);
        System.out.println("After Swapping Second number is :"+ num2);

    }
}