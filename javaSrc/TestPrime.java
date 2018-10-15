package javaSrc;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(_isPrime(n));
        for (int i = 2; i <= n; i++) {
            if(_isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n%2 == 0 || n%3 == 0) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean _isPrime(int n) {

        if(n <= 1) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n%2 == 0 || n%3 == 0) {
            return false;
        }

        int root = (int)Math.sqrt(n);
        for(int i = 5; i <= root; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

}
