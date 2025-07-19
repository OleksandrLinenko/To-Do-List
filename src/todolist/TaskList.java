/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ui.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class TaskList {

    List<Task> tasks = new ArrayList();

    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks(boolean all) {
        List<Task> result = new ArrayList();
        if (all != true) {
            for (Task task : tasks) {
                if (task.getState() == States.UNCOMPLETED) {
                    result.add(task);
                }
            }
        } else {
            for (Task task : tasks) {
                result.add(task);
            }
        }

        return result;
    }

    public List<Task> getTasks(boolean all, LocalDate date) {
        List<Task> result = new ArrayList();
        if (all != true) {
            for (Task task : tasks) {
                if (task.getDate() == date) {
                    if (task.getState() == States.UNCOMPLETED) {
                        result.add(task);
                    }
                }
            }
        } else {
            for (Task task : tasks) {
                if (task.getDate() == date) {
                    result.add(task);
                }
            }
        }

        return result;
    }
}
