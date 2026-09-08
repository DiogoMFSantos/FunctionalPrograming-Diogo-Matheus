package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.List;

//encontrar linhas que contem palavras
public class LinesWithWordAnalyser {
    private LinesWithWordAnalyser(){

    }

    public static List<String> linesWithWord(Path path, String targetWord) throws IOException {
        try (Stream<String> lines= Files.lines(path)){
                       return lines.filter(line -> line.toLowerCase()
                               .contains(targetWord.toLowerCase()))
                               .toList();
        }
    }
}
