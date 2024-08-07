package Day04;

import java.util.Scanner;

public class Area_Hexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side length of hexagon :");
        double s = sc.nextDouble();

        double Area = (6 * Math.pow(s, 2))/(4* Math.tan(Math.PI / 6));

        System.out.println("Area of hexagon is :"+ Area);
    }
}
