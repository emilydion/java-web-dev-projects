import java.util.Arrays;

public class Array {
    public static void main (String[] args) {
        int [] intArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] % 2) != 0) {
                System.out.println(intArray[i]);
            }
        }

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String [] wordStorage = paragraph.split(" ");
        System.out.println(Arrays.toString(wordStorage));

        String [] sentenceStorage = paragraph.split("\\.");
        System.out.println(Arrays.toString(sentenceStorage));
    }
}
