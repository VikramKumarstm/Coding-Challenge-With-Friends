package Day04;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = "ashutosh@gmail.com";
        String password = "ashutosh@123";
        String userEmail = null, userPassword = null;



        while(userEmail == null || userPassword == null) {

            System.out.println("Enter your email :");
            userEmail = sc.nextLine();
            System.out.println("Enter your password :");
            userPassword = sc.nextLine();
            
            if(userEmail.equals(email)) {
                if(userPassword.equals(password)) {
                    System.out.println("Login Successful");
                    System.out.println("Welcome to your Dashboard.");
                } else {
                    System.out.println("Invalid Password!");
                }
            } else {
                System.out.println("Invalid Email!");
            }
        }
    }
}
