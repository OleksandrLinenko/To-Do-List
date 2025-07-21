/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class TaskList {

    List<Task> tasks = new ArrayList();

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task findTask(String note, LocalDate date) {
        for (Task task : tasks) {
            if (task.getNote().equals(note) || task.getDate() == date) {
                return task;
            }
        }

        return null;
    }

    public List<Task> getTasks(boolean all) {
        List<Task> result = new ArrayList();
        if (all == true) {
            for (Task task : tasks) {
                result.add(task);
            }
        } else {
            for (Task task : tasks) {
                if (task.getState() == States.UNCOMPLETED) {
                    result.add(task);
                }
            }
        }

        return result;
    }

    public List<Task> getTasks(boolean all, LocalDate date) {
        List<Task> result = new ArrayList();
        if (all == true) {
            for (Task task : tasks) {
                if (task.getDate().equals(date)) {
                    result.add(task);
                }
            }
        } else {
            for (Task task : tasks) {
                if (task.getDate().equals(date) && task.getState() == States.UNCOMPLETED) {
                    result.add(task);
                }
            }
        }

        return result;
    }
}
