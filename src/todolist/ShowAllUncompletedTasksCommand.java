/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import ui.ShowTasks;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowAllUncompletedTasksCommand {

    public static ShowAllUncompletedTasksCommand create() {
        return new ShowAllUncompletedTasksCommand();
    }

    public void handle() {
        ShowTasks.create().handle(Application.getInstance().getTaskList().getTasks(false));
    }

}
