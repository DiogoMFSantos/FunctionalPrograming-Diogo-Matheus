package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//primeira palavra com mais de n caracteres
public class FirstLongWordAnalyser {

    private FirstLongWordAnalyser() {
    }

    public static String findFirstWordLongerThan(Path path, int n) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .filter(word -> word.length() > n)
                    .findFirst()
                    .orElse("");
        }
    }
}