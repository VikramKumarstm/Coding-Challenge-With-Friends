package Day04;

import java.util.Scanner;

public class HexadecimalToOctal {

    public static String hexToBinary(String hex) {
        StringBuilder binary = new StringBuilder();

        String hexToBin[] = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };

        for(char hexChar : hex.toCharArray()) {
            if(hexChar >= '0' && hexChar <= '9') {
                binary.append(hexToBin[hexChar - '0']);
            } else if(hexChar >= 'A' && hexChar <= 'F') {
                binary.append(hexToBin[hexChar - 'A' + 10]);
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                binary.append(hexToBin[hexChar - 'a' + 10]);
            } else {
                System.out.println("Invalid hexadecimal input.");
                return "";
            }
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hexa decimal number :");
        String hex = sc.nextLine();

        String binary = hexToBinary(hex);

        System.out.println("Hexadecimal number : "+ hex);
        System.out.println("Binary number : "+ binary);
 
    }
}
