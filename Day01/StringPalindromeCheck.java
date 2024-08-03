import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text :");
        String text = sc.nextLine();

        int i=0;
        int j= text.length()-1;
        boolean isPalindrome = true;
        

        while(i < j && isPalindrome) {
            if(text.charAt(i) != text.charAt(j)) {
                isPalindrome = false;
                break;
            }
            
            i++;
            j--;
        }

        if(isPalindrome) {
            System.out.println("Given text is Palindromic String");
        } else {
            System.out.println("Given text is not a Palindromic String");
        }
    }
}
