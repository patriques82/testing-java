public class TestPurify {

    public static void main(String[] args) {
        int[] input0 = {-1, 10, 8, -4, 0, -19, 22};
        int[] expected0 = { 10, 8, 0, 22 };
        testPurify(input0, expected0);

        int[] input1 = {-1};
        int[] expected1 = {};
        testPurify(input1, expected1);

        int[] input2 = {};
        int[] expected2 = {};
        testPurify(input2, expected2);

        int[] input3 = {-99, -1, -3};
        int[] expected3 = {};
        testPurify(input3, expected3);

        int[] input4 = {-1, 0, -1};
        int[] expected4 = {0};
        testPurify(input4, expected4);
    }

    // Test
    private static void testPurify(int[] input, int[] expected) {
        if (testPurifyGeneral(input, expected)) {
            System.out.println("OK");
        } else {
            fail(input, expected);
        }
    }

    // Test input with expected
    private static boolean testPurifyGeneral(int[] input, int[] expected) {
        int[] res = Purifier.purify(input);
        if (res.length != expected.length) {
            return false;
        }
        for (int i=0; i < res.length; i++) {
            if (res[i] != expected[i]) {
                return false; // break
            }
        }
        return true;
    }

    // Print error message
    private static void fail(int[] input, int[] expected) {
        System.err.println("");
        System.err.println("");
        System.err.println("Failed result");
        System.err.print("Expected: ");
        for (int i : expected) {
            System.err.print(i + " ");
        }
        System.err.println("");
        System.err.print("Received: ");
        for (int i : input) {
            System.err.print(i + " ");
        }
    }
}
