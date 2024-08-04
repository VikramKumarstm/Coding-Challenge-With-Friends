package Day02;

public class SumTowBinaryNum {
    public static void main(String[] args) {
        int bNum1 = 101;
        int bNum2 = 110;
        int carry = 0, i=0;
        int result[] = new int[20];

        while(bNum1 != 0 && bNum2 != 0) {
            result[i++] = (bNum1%10 + bNum2%10 + carry) % 2;
            carry = (bNum1%10 + bNum2%10 + carry) / 2;
            bNum1 /= 10;
            bNum2 /= 10;
        }

        if(carry != 0) {
            result[i++] = carry;
        }

        System.out.print("Sum of Two binary Number is :");
        while(i > 0) {
            System.out.print(result[--i]);
        }
    }
}
