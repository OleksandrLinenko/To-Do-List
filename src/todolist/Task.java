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

    private int idNumber;
    private String note;
    private State state;
    private LocalDate date;

    public Task(int idNumber, String note, State state, LocalDate date) {
        if (note.isEmpty() || date == null) {
            throw new IllegalArgumentException("Illegal argument");
        }
        this.idNumber = idNumber;
        this.note = note;
        this.state = state;
        this.date = date;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getNote() {
        return note;
    }

    public State getState() {
        return state;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void makeCompleted() {
        try {
            if (state.equals(State.COMPLETED)) {
                throw new Exception("Selected task is already completed");
            }
            state = State.COMPLETED;
        } catch (Exception ex) {
            System.err.println("Error while changing task's state");
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %d.%d.%d %s\n", idNumber, note, date.getDayOfMonth(), date.getMonthValue(), date.getYear(), state.getState());
    }
}
