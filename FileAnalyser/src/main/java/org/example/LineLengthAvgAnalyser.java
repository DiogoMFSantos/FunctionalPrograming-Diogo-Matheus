package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LineLengthAvgAnalyser {
    private LineLengthAvgAnalyser(){
    }

    public static double countAvgLineLenght(Path path) throws IOException {
        try (Stream<String> lines= Files.lines(path)) {
            return lines.mapToInt(line->line.length()).average().orElse(0.0);
        }
    }
}
