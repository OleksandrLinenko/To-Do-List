/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.ShowTasks;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowAllTasksCommand {

    public static ShowAllTasksCommand create() {
        return new ShowAllTasksCommand();
    }
    
    public void handle() {
        ShowTasks.create().handle(Application.getInstance().getTaskList().getTasks(true));
    }
}
