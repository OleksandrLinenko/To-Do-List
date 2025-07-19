/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.List;
import todolist.Task;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowTasks {

    public static ShowTasks create() {
        return new ShowTasks();
    }

    public void handle(List<Task> taskList) {
        for (Task task : taskList) {
            Message.create().show(task.toString());
        }
    }
}
