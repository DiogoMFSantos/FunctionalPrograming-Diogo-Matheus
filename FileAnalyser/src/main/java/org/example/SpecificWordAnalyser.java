package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecificWordAnalyser {
    private SpecificWordAnalyser(){
    }

    public static long specificWordCount(Path path, String targetWord) throws IOException {
        try (Stream<String> lines= Files.lines(path)){
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
            return words.filter(word -> word.equals(targetWord)).count();
        }
    }

}
