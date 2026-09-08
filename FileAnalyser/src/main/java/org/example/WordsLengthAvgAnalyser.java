package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//calcular tamanho medio das palavras
public class WordsLengthAvgAnalyser {
    private WordsLengthAvgAnalyser(){}

    public static double countAvgWordLength(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .mapToInt(word -> word.length())
                    .average()
                    .orElse(0.0);
        }
    }

}
