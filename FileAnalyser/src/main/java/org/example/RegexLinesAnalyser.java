package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class RegexLinesAnalyser {

    private RegexLinesAnalyser() {
    }

    public static List<String> findLinesMatchingRegex(Path path, String regex) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> line.matches(regex))
                    .toList();
        }
    }
}