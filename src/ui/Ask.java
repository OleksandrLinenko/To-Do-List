/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author oleksandrlinenko
 */
public class Ask {

    private static Scanner sc = new Scanner(System.in);

    public static Ask create() {
        return new Ask();
    }
    
    public int askInt(String string) {
        Message.create().show(string);
        return sc.nextInt();
    }
    
    public String askPath() {
        Message.create().show("Set path to file: ");
        return sc.nextLine();
    }
    
    public String askNote() {
        Message.create().show("Write note text");
        return sc.nextLine();
    }

    public LocalDate askDate() {
        Message.create().show("Set note's day, month and year: ");
        return LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
