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
public class ShowAllTasksByDateCommand {

    public static ShowAllTasksByDateCommand create() {
        return new ShowAllTasksByDateCommand();
    }

    public void handle() {
        ShowTasks.create().handle(Application.getInstance().getTaskList().getTasks(true, Ask.create().askDate()));
    }
}
