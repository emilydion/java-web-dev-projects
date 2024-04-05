import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountingCharacters {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.print("Enter a quote: ");
        String quote = input.nextLine();
        input.close();

        char[] charInString = quote.toCharArray();
        HashMap<Character, Integer> finalCount = countCharacters(charInString);
        printHashMap(finalCount);
    }

    public static HashMap<Character, Integer> countCharacters (char [] charInString) {
        HashMap<Character, Integer> finalCount = new HashMap<>();
        finalCount.put(charInString[0], 0);

        for (int i = 0; i < charInString.length; i++) {
            for (int j = 0; j < finalCount.size(); j++) {
                if (!finalCount.containsKey(charInString[i])) {
                    finalCount.put(charInString[i], 0);
                }
            }
            if (finalCount.containsKey(charInString[i])) {
                finalCount.put(charInString[i], finalCount.get(charInString[i]) + 1);
            }
        }

        return finalCount;
    }

    public static void printHashMap(HashMap<Character, Integer> finalCount) {
        for (Map.Entry<Character, Integer> letter : finalCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}


