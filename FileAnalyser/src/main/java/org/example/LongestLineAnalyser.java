package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

//encontrar a maior linha
public class LongestLineAnalyser {

    private LongestLineAnalyser() {
    }

    public static String findLongestLine(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");
        }
    }
}