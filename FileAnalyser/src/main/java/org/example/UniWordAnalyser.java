package org.example;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class UniWordAnalyser {
    public UniWordAnalyser(){
    }

    public static long uniqueWordCount(Path path) throws IOException {
            try (Stream<String> lines= Files.lines(path)){
                Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
                return words.distinct().count();
            }


    }
}
