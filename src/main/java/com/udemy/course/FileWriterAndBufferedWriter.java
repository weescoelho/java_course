package com.udemy.course;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
  public static void main(String[] args) {
    String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

    String path = "C:\\temp\\out.txt";
    // FileWriter com true no segundo argumento permite que o arquivo não seja
    // recriado
    // O programa irá escrever no final do arquivo
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
