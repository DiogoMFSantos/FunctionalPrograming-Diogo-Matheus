package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WordsLenghtAvgAnalyser {
    private WordsLenghtAvgAnalyser(){}

    public static double countAvgWordLength(Path path) throws IOException {
        try (Stream<String> lines= Files.lines(path)) {
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
            return words.mapToInt(word->word.length()).average().orElse(0.0);
        }
    }

}
