package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

            Path path = Path.of(
                    "src/main/resources/file.txt"
            );

            long numberOfLines = FileAnalyser.countLines(path);
            long numberOfWords = WordAnalyser.countWords(path);
            long numberOfNonBlanks = NonEmptyAnalyser.countNonBlanks(path);
            long numberOfUniWords = UniWordAnalyser.uniqueWordCount(path);
            long numberOfSpeWords = SpecificWordAnalyser.specificWordCount(path,"Cheeseburgers");
            long numberOfLinesWithWord = LinesWithWordAnalyser.linesWithWordCound(path,"my");

            System.out.println(numberOfLines);
            System.out.println(numberOfWords);
            System.out.println(numberOfNonBlanks);
            System.out.println(numberOfUniWords);
            System.out.println(numberOfSpeWords);
            System.out.println(numberOfLinesWithWord);
        }
    }
