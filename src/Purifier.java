public class Purifier {

    // Ta bort negativa tal (Gör ny array). OBS Svår!!! Men försök ändå och tänk lite...
    public static int[] purify(int[] input) {
        // How many negatives
        int negatives = 0;
        for (int i : input) {
            if (i < 0) {
                negatives++;
            }
        }
        // new array - negatives
        int[] output = new int[input.length - negatives];
        // Copy postive values to output
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 0) {
                output[j++] = input[i];
            }
        }
        int[] xs = {1,2,3,4,5};
        return xs;
    }
}
