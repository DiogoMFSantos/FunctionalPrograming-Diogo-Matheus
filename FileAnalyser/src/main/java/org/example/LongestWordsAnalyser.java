package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//encontra as n palavras mais longas
public class LongestWordsAnalyser {

    private LongestWordsAnalyser() {
    }

    public static List<String> findLongestWords(Path path, int n) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(n)
                    .toList();
        }
    }
}