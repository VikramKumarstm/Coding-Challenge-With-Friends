package Day04;

import java.util.Scanner;

public class CountLettersSpacesCharAndOtherChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();

        int letter = 0;
        int number = 0;
        int other = 0;
        int space = 0;

        for(int i=0; i<str.length(); i++) {
            if(Character.isLetter(ch[i])) {
                letter++;

            } else if(Character.isDigit(ch[i])) {
                number++;

            } else if(Character.isSpaceChar(ch[i])) {
                space++;

            } else {
                other++;

            }
        }

        System.out.println("letter: " + letter);
        System.out.println("number: " + number);
        System.out.println("space: " + space);
        System.out.println("other: " + other);

    }
}