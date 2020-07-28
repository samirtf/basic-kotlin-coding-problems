package stringnumbersandmath;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCounterJava implements CodingProblem {

    private final String string;

    public DuplicateCharactersCounterJava(String string) {
        this.string = string;
    }

    @Override
    public String getDescription() {
        return "Write a program that counts duplicate characters from a given string";
    }


    @Override
    public void execute() {
        final Map<Character, Integer> duplicateCharactersCountMap = new HashMap<>();

        for(char _char: string.toCharArray()) {
            duplicateCharactersCountMap.compute(_char, (key, value) -> value == null ? 1 : ++value);
        }

        System.out.printf("%s", duplicateCharactersCountMap.toString());
    }
}
