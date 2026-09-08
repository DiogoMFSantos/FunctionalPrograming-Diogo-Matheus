package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

//encontrar palindromos
public class PalindromeAnalyser {

    private PalindromeAnalyser() {
    }

    public static List<String> findPalindromes(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .map(String::toLowerCase)
                    .filter(word -> word.length() > 1)
                    .filter(word ->
                            word.equals(new StringBuilder(word).reverse().toString())
                    )
                    .distinct()
                    .toList();
        }
    }
}