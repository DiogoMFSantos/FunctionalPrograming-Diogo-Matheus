package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

//encotrar linhas que contenham algum número
public class LinesWithNumbersAnalyser {

    private LinesWithNumbersAnalyser() {
    }

    public static List<String> findLinesWithNumbers(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> line.matches(".*\\d.*"))
                    .toList();
        }
    }
}