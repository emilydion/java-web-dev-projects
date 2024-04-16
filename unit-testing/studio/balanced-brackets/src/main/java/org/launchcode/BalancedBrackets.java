package org.launchcode;

import java.util.Arrays;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static int findBracketPairs(char [] charArray) {
        int brackets = 0;
        int index = 0;

        for (char ch : charArray) {
            index++;
            if (ch == '[') {
                brackets++;
                break;
            }
        }

        char [] charArrayEnd = Arrays.copyOfRange(charArray, index, charArray.length);
        for (char ch : charArrayEnd) {
            index++;
            if (ch == ']') {
                brackets--;
                break;
            }
        }

        return brackets;
    }

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
//        int index = 0;

        char [] charArray = str.toCharArray();
//        for (char ch : charArray) {
//            index++;
//            if (ch == '[') {
//                brackets++;
//                break;
//            }
//        }
//
//        char [] charArrayEnd = Arrays.copyOfRange(charArray, index, charArray.length);
//        for (char ch : charArrayEnd) {
//            index++;
//            if (ch == ']') {
//                brackets--;
//            }
//        }
        brackets = findBracketPairs(charArray);

        return brackets == 0;

     //   return brackets == 0;
    }
}