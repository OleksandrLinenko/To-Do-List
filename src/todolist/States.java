/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package todolist;

/**
 *
 * @author oleksandrlinenko
 */
public enum States {
    COMPLETED("completed"), UNCOMPLETED("uncompleted");

    String state;

    States(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
