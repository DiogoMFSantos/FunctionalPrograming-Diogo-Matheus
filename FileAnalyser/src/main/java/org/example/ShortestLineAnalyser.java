package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class ShortestLineAnalyser {

    private ShortestLineAnalyser() {
    }

    public static String findShortestLine(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .min(Comparator.comparingInt(String::length))
                    .orElse("");
        }
    }
}