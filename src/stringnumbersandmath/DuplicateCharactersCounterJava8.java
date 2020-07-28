package stringnumbersandmath;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersCounterJava8 implements CodingProblem {

    private final String string;

    public DuplicateCharactersCounterJava8(String string) {
        this.string = string;
    }

    @Override
    public String getDescription() {
        return "Write a program that counts duplicate characters from a given string";
    }


    @Override
    public void execute() {
        final Map<Character, Long> duplicateCharactersCountMap = string.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        System.out.printf("%s", duplicateCharactersCountMap.toString());
    }
}
