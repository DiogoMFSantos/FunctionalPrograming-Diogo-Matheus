package org.example;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//contar palavras unicas
public class UniWordAnalyser {
    public UniWordAnalyser(){
    }

    public static long uniqueWordCount(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .map(String::toLowerCase)
                    .distinct()
                    .count();
        }
    }
}
