package com.udemy.course;

import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    // Exception -> o compilador obriga a tratar ou passar para frente
    // RuntimeException -> O compilar não exige tratamento do erro

    // Estrutura try-catch

    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      // é necessário apontar (e.g ArrayIndexOutOfBoundsException) qual o tipo de
      // excessão o catch irá capturar
      System.out.println("Invalid position");
      e.printStackTrace();
    }

    sc.close();

  }
}
