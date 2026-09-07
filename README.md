# File Analyser

A Java utility project for analysing text files using functional programming concepts, Java Streams and lambda expressions.

## Features

The application can:

- Count lines in a file
- Count words in a file
- Count non-empty lines
- Count unique words
- Count occurrences of a specific word (case-insensitive)
- Find lines containing a specific word
- Calculate the average line length
- Calculate the average word length
- Find the shortest line
- Find the longest line
- Find the top N longest words
- Find the first word longer than N characters
- Find common words between two files
- Calculate the frequency of every word
- Find lines containing numbers
- Find lines matching a regular expression
- Find palindromic words

## Technologies

- Java 17
- Maven
- Java Streams
- Lambda Expressions
- Java NIO (`Files` and `Path`)

## Project Structure

Text files used by the application are located in:

`src/main/resources`

The project includes two sample files:

- `file.txt`
- `file2.txt`

## Running the Project

Compile the project with Maven:

```bash
mvn clean package