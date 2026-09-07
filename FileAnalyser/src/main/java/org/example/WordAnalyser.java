package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;


public class WordAnalyser {
    private WordAnalyser() {
        // Utility class - prevent creating objects
    }

    public static long countWords(Path path) throws IOException {
        try (Stream<String> lines= Files.lines(path)){
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
            return words.count();
        }
    }
}
