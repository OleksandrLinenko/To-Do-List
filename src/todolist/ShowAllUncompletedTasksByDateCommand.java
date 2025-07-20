/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.Ask;
import ui.ShowTasks;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowAllUncompletedTasksByDateCommand {

    public static ShowAllUncompletedTasksByDateCommand create() {
        return new ShowAllUncompletedTasksByDateCommand();
    }

    public void handle() {
        ShowTasks.create().handle(Application.getInstance().getTaskList().getTasks(false, Ask.create().askDate()));
    }
}
