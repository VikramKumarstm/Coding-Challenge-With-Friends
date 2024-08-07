package Day04;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n +" Elements :");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int countEven = 0, countOdd = 0;
        
        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                countEven++;
            }
            
            if(arr[i] %2 != 0) {
                countOdd++;
            }
        }

        System.out.println("Number of Even elements are : "+ countEven);
        System.out.println("Number of Odd elements are :"+ countOdd);
    }
}
