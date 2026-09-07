package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public final class FileAnalyser {
    private FileAnalyser() {
        // Utility class - prevent creating objects
    }

    public static long countLines(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines.count();
        }
    }
}