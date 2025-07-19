/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.ShowCompTasks;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowCompTasksCommand {

    public static ShowCompTasksCommand create() {
        return new ShowCompTasksCommand();
    }
    
    public void handle() {
        ShowCompTasks.create().handle(Application.getInstance().getTaskList());
    }
}
