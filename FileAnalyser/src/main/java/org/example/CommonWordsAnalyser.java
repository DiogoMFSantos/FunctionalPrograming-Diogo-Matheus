package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonWordsAnalyser {

    private CommonWordsAnalyser() {
    }

    public static Set<String> findCommonWords(Path path1, Path path2) throws IOException {

        Set<String> wordsFromFirstFile;

        try (Stream<String> lines = Files.lines(path1)) {
            wordsFromFirstFile = lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
        }

        try (Stream<String> lines = Files.lines(path2)) {
            return lines
                    .filter(line -> !line.isBlank())
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .map(String::toLowerCase)
                    .filter(wordsFromFirstFile::contains)
                    .collect(Collectors.toSet());
        }
    }
}