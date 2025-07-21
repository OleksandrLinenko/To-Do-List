/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class Ask {

    private static Scanner sc = new Scanner(System.in);

    public static Ask create() {
        return new Ask();
    }

    public String askString(String string) {
        Message.create().show(string);
        return sc.nextLine();
    }

    public int askInt(String string) {
        Message.create().show(string);
        return sc.nextInt();
    }

    public LocalDate askDate() {
        Message.create().show("Set day: ");
        int day = sc.nextInt();
        Message.create().show("Set month: ");
        int month = sc.nextInt();
        Message.create().show("Set year: ");
        int year = sc.nextInt();
        if((day <= 0 || day > 31) || (month <= 0 || month > 12) || (year > 2025)) {
            throw new IllegalArgumentException("Invalid date");
        }
        return LocalDate.of(year, month, day);
    }
}
