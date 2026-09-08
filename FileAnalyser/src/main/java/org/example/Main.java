package org.example;

import java.io.IOException;

public class Main {

        public static void main(String[] args) {
            try {
                FileAnalyserDemo.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}