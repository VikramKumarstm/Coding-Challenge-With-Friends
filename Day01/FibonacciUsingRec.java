import java.util.Scanner;

public class FibonacciUsingRec {

    public static int finbonacciFinding(int n) {
        int result = 0;

        //Base case condition
        if(n == 0) {
            return 0;
        } else if(n==1) {
            return 1;
        }
        //recursive function call
        else {
            return (finbonacciFinding(n-1) + finbonacciFinding(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of term :");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            System.out.print(finbonacciFinding(i) +" ");
        }
    }
}
