import java.awt.*;

public class TestAdder {

    public static void main(String[] args) {
        testAdder(1, 2, 3);
        testAdder(100, 200, 300);
        testAdder(-1, -3, -4);
        testAdder(0, -3, -3);
    }

    private static void testAdder(int i, int j, int expected) {
        int res = Adder.add(i, j);
        if (expected == res) {
            System.out.println("OK");
        } else {
            System.err.println("Error: recieved " + res + ", expected " + expected);
        }
    }
}
