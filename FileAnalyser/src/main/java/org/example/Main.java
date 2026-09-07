package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
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
            List<String> linesWithWord =
                    LinesWithWordAnalyser.linesWithWord(path, "my");
            double avgLenghtOfLines = LineLenghtAvgAnalyser.countAvgLineLenght(path);
            double avgLenghtOfWords = WordsLenghtAvgAnalyser.countAvgWordLength(path);
            String longestLine = LongestLineAnalyser.findLongestLine(path);
            List<String> longestWords = LongestWordsAnalyser.findLongestWords(path, 3);
            String firstLongWord =
                    FirstLongWordAnalyser.findFirstWordLongerThan(path, 10);



            System.out.println(numberOfLines);
            System.out.println(numberOfWords);
            System.out.println(numberOfNonBlanks);
            System.out.println(numberOfUniWords);
            System.out.println(numberOfSpeWords);
            linesWithWord.forEach(System.out::println);
            System.out.println(avgLenghtOfLines);
            System.out.println(avgLenghtOfWords);
            System.out.println(longestLine);
            longestWords.forEach(word -> System.out.println(word));
            System.out.println(firstLongWord);
        }
    }
