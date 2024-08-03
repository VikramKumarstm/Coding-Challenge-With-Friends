public class PowOfAnyNum {
    public static void main(String[] args) {
        int base = 5;
        int exp = 3;
        int pow = 1;

        for(int i=1; i<=exp; i++) {
            pow *= base;
        }

        System.out.println("Power of "+base+"^"+exp+" is :"+ pow);
    }
}
