package com.bridgelabz.algorithm;

import java.time.LocalDate;

public class Calender {

    int[][] dates = new int[6][7];

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 12, 22);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week in number : "+dayOfWeek.getValue());
        System.out.println("Day of week in text : "+dayOfWeek.toString());
    }

}
