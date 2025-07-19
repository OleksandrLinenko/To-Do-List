/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.time.LocalDate;
import todolist.TaskList;
import todolist.States;
import todolist.Task;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowUncompTasksByDate {

    public static ShowUncompTasksByDate create() {
        return new ShowUncompTasksByDate();
    }

    public void handle(TaskList taskList, LocalDate date) {
        for (Task task : taskList.getTasks()) {
            if (task.getDate() == date) {
                if (task.getState() == States.UNCOMPLETED) {
                    Message.create().show(task.toString());
                }
            }
        }
    }
}
