/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.Ask;
import ui.ShowCompTasksByDate;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowCompTasksByDateCommand {

    public static ShowCompTasksByDateCommand create() {
        return new ShowCompTasksByDateCommand();
    }

    public void handle() {
        ShowCompTasksByDate.create().handle(Application.getInstance().getTaskList(), Ask.create().askDate());
    }
}
