/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package todolist;

/**
 *
 * @author oleksandrlinenko
 */
public enum State {
    COMPLETED("completed"), UNCOMPLETED("uncompleted");

    String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
