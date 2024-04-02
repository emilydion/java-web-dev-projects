import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int [] listNumbers = {4, 17, 20, 35, 37, 48, 52, 57, 62, 69};
        for (int number : listNumbers) {
            integers.add(number);
        }

        ArrayList<String> wordList = new ArrayList<>();
        String [] listStrings = {"Emily", "Word", "Jay", "Earth", "Could"};
        for (String listItem : listStrings) {
            wordList.add(listItem);
        }

        int sum = sumOfEvens(integers);
        System.out.println(sum);

        printFive(wordList);
    }

    public static int sumOfEvens (ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    public static void printFive (ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        boolean found = false;

        System.out.println("Enter the length of the word you would like to find:");
        int searchLength = input.nextInt();
        input.close();

        for (String word : words) {
            if (word.length() == searchLength) {
                found = true;
                System.out.println(word);
            }
        }

        if (!found) {
            System.out.println("There are no words with that length!");
        }
    }
}
