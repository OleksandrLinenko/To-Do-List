/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author oleksandrlinenko
 */
public class Task {

    private String note;
    private States state;

    public Task(String note, States state) {
        this.note = note;
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public States getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n", note, state.getState());
    }
}
