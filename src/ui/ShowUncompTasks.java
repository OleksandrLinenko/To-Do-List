/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.List;
import todolist.DateTasks;
import todolist.States;
import todolist.Task;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowUncompTasks {
    public static ShowUncompTasks create() {
        return new ShowUncompTasks();
    }
    
    public void handle(List<DateTasks> dateTasks) {
        for(DateTasks dateTask : dateTasks) {
            Message.create().show(dateTask.toString());
            List<Task> tasks = dateTask.getTasks();
            for(Task task : tasks) {
                if(task.getState() == States.UNCOMPLETED) {
                   Message.create().show(task.toString()); 
                }
            }
        }
    }
 }
