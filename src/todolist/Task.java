/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.time.LocalDate;

/**
 *
 * @author oleksandrlinenko
 */
public class Task {

    private String note;
    private States state;
    private LocalDate date;

    public Task(String note, States state, LocalDate date) {
        this.note = note;
        this.state = state;
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public States getState() {
        return state;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setState(States state) {
        this.state = state;
    }
    

    @Override
    public String toString() {
        return String.format("%s %d.%d.%d %s\n", note, date.getDayOfMonth(), date.getMonth(), date.getYear(), state.getState());
    }
}
