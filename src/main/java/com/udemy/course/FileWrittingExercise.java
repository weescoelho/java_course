package com.udemy.course;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWrittingExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String strPath = "c:\\temp";
    boolean success = new File(strPath + "\\out").mkdir();
    String filePath = "c:\\temp\\out\\summary.csv";
    List<String> lines = new ArrayList<>();

    if (success) {
      System.out.println("Out folder created successfully!");
    }

    System.out.println("Enter with quantity entries: ");
    int entries = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < entries; i++) {
      System.out.println("Enter a product: ");
      String entry = sc.nextLine();
      String[] infos = entry.split(",");
      Float price = Float.parseFloat(infos[1]);
      int quantity = Integer.parseInt(infos[2]);

      Float total = price * quantity;

      String finallyLine = infos[0] + "," + total;
      lines.add(finallyLine);
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    sc.close();
  }
}
