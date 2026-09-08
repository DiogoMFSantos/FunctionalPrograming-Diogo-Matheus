package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//contar linhas nao vazias
public class NonEmptyAnalyser {
    private NonEmptyAnalyser(){

    }
    public static long countNonBlanks(Path path) throws IOException {
        try (Stream<String> lines= Files.lines(path)){
            return lines.filter(line -> !line.isBlank())
                        .count();
        }
    }
}
