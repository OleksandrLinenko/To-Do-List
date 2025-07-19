/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.time.LocalDate;
import todolist.States;
import todolist.Task;
import todolist.TaskList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowCompTasksByDate {

    public static ShowCompTasksByDate create() {
        return new ShowCompTasksByDate();
    }

    public void handle(TaskList taskList, LocalDate date) {
        for (Task task : taskList.getTasks()) {
            if (task.getDate() == date) {
                if (task.getState() == States.COMPLETED) {
                    Message.create().show(task.toString());
                }
            }
        }
    }
}
