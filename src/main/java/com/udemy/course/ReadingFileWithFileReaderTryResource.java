package com.udemy.course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileWithFileReaderTryResource {
  public static void main(String[] args) {
    String path = "c:\\temp\\in.txt";

    // Instanciação não necessita de fechar o recurso - Java 7 +
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());

    }
  }
}
