package javaSrc;

public class SwapNumber {
    public static void main(String[] args) {
        int x = 50;
        int y = 40;

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.print("x: " + x + ", y: " + y);
    }
}
