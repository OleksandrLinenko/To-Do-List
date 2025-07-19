/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.ShowUncompTasks;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowUncompTasksCommand {
    public static ShowUncompTasksCommand create() {
        return new ShowUncompTasksCommand();
    }
    
    public void handle() {
        ShowUncompTasks.create().handle(Application.getInstance().getTasks());
    }
}
