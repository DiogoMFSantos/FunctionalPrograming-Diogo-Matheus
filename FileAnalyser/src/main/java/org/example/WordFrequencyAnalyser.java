package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//contar quantas vezes cada palavra aparece
public class WordFrequencyAnalyser {

    private WordFrequencyAnalyser() {
    }

    public static Map<String, Long> countWordFrequency(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(
                            word -> word, Collectors.counting()
                    ));
        }
    }
}