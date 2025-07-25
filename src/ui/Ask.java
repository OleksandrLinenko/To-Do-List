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
        return sc.next();
    }

    public int askInt(String string) {
        Message.create().show(string);
        return sc.nextInt();
    }

    public LocalDate askDate() {
        boolean correct = false;
        LocalDate date = null;
        do {
            try {
                Message.create().show("Set day: ");
                int day = sc.nextInt();
                Message.create().show("Set month: ");
                int month = sc.nextInt();
                Message.create().show("Set year: ");
                int year = sc.nextInt();
                date = LocalDate.parse(String.format("%d-%02d-%02d", year, month, day));
                correct = true;
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        } while (!correct);

        return date;
    }
}
