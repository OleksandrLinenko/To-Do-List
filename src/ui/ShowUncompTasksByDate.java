/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.time.LocalDate;
import java.util.List;
import todolist.DateTasks;
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

    public void handle(List<DateTasks> dateTasks, LocalDate date) {
        for (DateTasks dateTask : dateTasks) {
            if (dateTask.getDate() == date) {
                Message.create().show(dateTask.toString());
                List<Task> tasks = dateTask.getTasks();
                for (Task task : tasks) {
                    if (task.getState() == States.COMPLETED) {
                        Message.create().show(task.toString());
                    }
                }
            }
        }
    }
}
