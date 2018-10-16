package javaSrc;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int n = num;
        int sum = 0;
        while(num > 0) {
            int r = num%10;
            sum = (sum * 10) + r;
            num = num/10;
        }

        if(n == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
