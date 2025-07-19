/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import todolist.States;
import todolist.Task;
import todolist.TaskList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowCompTasks {

    public static ShowCompTasks create() {
        return new ShowCompTasks();
    }

    public void handle(TaskList taskList) {
        for (Task task : taskList.getTasks()) {
            if (task.getState() == States.COMPLETED) {
                Message.create().show(task.toString());
            }
        }
    }
}
