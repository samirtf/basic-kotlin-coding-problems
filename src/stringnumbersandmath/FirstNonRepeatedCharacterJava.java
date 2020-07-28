package stringnumbersandmath;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterJava implements CodingProblem {

    private static final int EXTENDED_ASCII_CODES = 256;
    private static final int EMPTY = -1;
    private static final int REPEADTED = -2;

    private final String string;

    public FirstNonRepeatedCharacterJava(String string) {
        this.string = string;
    }

    @Override
    public String getDescription() {
        return "Write a program that returns the first non-repeated character from a given string";
    }


    @Override
    public void execute() {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        // Fill array with -1 that's meant to store the indexes
        // of all of the characters that appear exactly once in the string
        Arrays.fill(flags, EMPTY);

        for (int i = 0; i < string.length() ; i++) {
            final char _char = string.charAt(i);
            final boolean isCharAlreadySet = flags[_char] != EMPTY;
            if(isCharAlreadySet) {
                flags[_char] = REPEADTED;
            } else {
                flags[_char] = i; // i is to represent the order of setting up the flag array cell
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if(flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        final int firstNonRepeatedIndex = position == Integer.MAX_VALUE ? Character.MIN_VALUE : string.charAt(position);
        System.out.printf("%s", firstNonRepeatedIndex);
    }
}
