
package com.udemy.course;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {
  public static void main(String[] args) {
    // Instanciação de data hora

    // Doc:
    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    // Classe de formatação de data hora do Java
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    // Formatação do Instant considerando o zone id do PC que está rodando o
    // programa

    LocalDate date = LocalDate.now();
    LocalDateTime date02 = LocalDateTime.now();
    Instant date03 = Instant.now(); // Padrão GMT (Zulu)

    LocalDate date04 = LocalDate.parse("2022-08-20");
    LocalDateTime date05 = LocalDateTime.parse("2022-08-20T01:30:25");
    Instant date06 = Instant.parse("2022-08-20T01:30:25Z");

    // Formatação de saída

    Instant date07 = Instant.parse("2022-08-20T01:30:25-03:00");

    LocalDate date08 = LocalDate.parse("20/07/2022", fmt1);
    LocalDate date09 = LocalDate.parse("20/07/2022 01:30", fmt2);
    LocalDate date10 = LocalDate.of(2022, 3, 18);

    System.out.println(date);
    System.out.println(date02);
    System.out.println(date03);
    System.out.println(date04.format(fmt1)); // Formatação de saída
    System.out.println(fmt1.format(date04)); // Formatação de saída - Forma 2
    System.out.println(date05);
    System.out.println(date06);
    System.out.println(fmt3.format(date06));
    System.out.println(date07);
    System.out.println(date08);
    System.out.println(date09);
    System.out.println(date10);

    // Formatação data-hora global para local

    LocalDate r1 = LocalDate.ofInstant(date06, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(date06, ZoneId.of("Portugal"));
    LocalDateTime r3 = LocalDateTime.ofInstant(date06, ZoneId.of("Portugal"));
    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r3 = " + r3);

    // Calculo com data hora

    LocalDate pastWeekLocalDate = date04.minusWeeks(1);
    LocalDate nextWeekLocalDate = date04.plusDays(7);
    System.out.println(pastWeekLocalDate);
    System.out.println(nextWeekLocalDate);

    Instant pastWeekInstant = date06.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = date06.plus(7, ChronoUnit.DAYS);

    System.out.println(pastWeekInstant);
    System.out.println(nextWeekInstant);

    Duration t1 = Duration.between(date06, nextWeekInstant);
    System.out.println(t1.toDays());

  }
}
