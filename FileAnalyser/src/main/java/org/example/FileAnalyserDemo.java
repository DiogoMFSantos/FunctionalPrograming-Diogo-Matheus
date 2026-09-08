package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FileAnalyserDemo {

    private FileAnalyserDemo() {
    }

    public static void run() throws IOException {

        Path path = Path.of("src/main/resources/file.txt");
        Path path2 = Path.of("src/main/resources/file2.txt");

        System.out.println("=== FILE ANALYSER ===");

        System.out.println("\n--- Basic Counts ---");
        System.out.println("Lines: " + FileAnalyser.countLines(path));
        System.out.println("Words: " + WordAnalyser.countWords(path));
        System.out.println("Non-empty lines: " + NonEmptyAnalyser.countNonBlanks(path));
        System.out.println("Unique words: " + UniWordAnalyser.uniqueWordCount(path));
        System.out.println(
                "Occurrences of 'Cheeseburgers': "
                        + SpecificWordAnalyser.specificWordCount(path, "Cheeseburgers")
        );

        System.out.println("\n--- Lines containing 'my' ---");
        List<String> linesWithWord =
                LinesWithWordAnalyser.linesWithWord(path, "my");
        linesWithWord.forEach(System.out::println);

        System.out.println("\n--- Length Analysis ---");
        System.out.println(
                "Average line length: "
                        + LineLengthAvgAnalyser.countAvgLineLenght(path)
        );
        System.out.println(
                "Average word length: "
                        + WordsLengthAvgAnalyser.countAvgWordLength(path)
        );
        System.out.println(
                "Shortest line: "
                        + ShortestLineAnalyser.findShortestLine(path)
        );
        System.out.println(
                "Longest line: "
                        + LongestLineAnalyser.findLongestLine(path)
        );

        System.out.println("\n--- Longest Words ---");
        List<String> longestWords =
                LongestWordsAnalyser.findLongestWords(path, 3);
        longestWords.forEach(System.out::println);

        System.out.println("\n--- First word longer than 10 characters ---");
        System.out.println(
                FirstLongWordAnalyser.findFirstWordLongerThan(path, 10)
        );

        System.out.println("\n--- Common Words ---");
        Set<String> commonWords =
                CommonWordsAnalyser.findCommonWords(path, path2);
        commonWords.forEach(System.out::println);

        System.out.println("\n--- Word Frequency ---");
        Map<String, Long> wordFrequency =
                WordFrequencyAnalyser.countWordFrequency(path);

        wordFrequency.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );

        System.out.println("\n--- Lines With Numbers ---");
        LinesWithNumbersAnalyser
                .findLinesWithNumbers(path)
                .forEach(System.out::println);

        System.out.println("\n--- Regex Matches: health ---");
        RegexLinesAnalyser
                .findLinesMatchingRegex(path, ".*health.*")
                .forEach(System.out::println);

        System.out.println("\n--- Palindromes ---");
        PalindromeAnalyser
                .findPalindromes(path)
                .forEach(System.out::println);


    }
}