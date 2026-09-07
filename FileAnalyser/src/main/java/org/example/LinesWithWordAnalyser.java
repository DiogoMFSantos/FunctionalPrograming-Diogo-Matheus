package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LinesWithWordAnalyser {
    private LinesWithWordAnalyser(){

    }

    public static long linesWithWordCount (Path path,String targetWord) throws IOException {
        try (Stream<String> lines= Files.lines(path)){
                       return lines.filter(line -> line.contains(targetWord)).count();
        }
    }
}
