package org.launchcode;

import java.util.Scanner;
public class StringSearch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceInWonderland = "Alice was beginning to get very tired of sitting by her sister" +
                "on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, ‘and what is the use of a " +
                "book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Enter a term to search for:");
        String searchTerm = input.nextLine();
        input.close();

        String[] searched = aliceInWonderland.split(" ");
        for (int i = 0; i < searched.length; i++) {
            if (searched[i].toLowerCase().equals(searchTerm.toLowerCase())) {
                System.out.println(searchTerm + " was word " + i + " in the sequence!");
            }
        }
    }
}
