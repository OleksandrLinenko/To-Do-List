/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import todolist.TaskList;
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
    
    public void handle(TaskList taskList) {
        for(Task task : taskList.getTasks()) {
                if(task.getState() == States.UNCOMPLETED) {
                   Message.create().show(task.toString()); 
                }
            }
        }
    }
