/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.Ask;
import ui.ShowUncompTasksByDate;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowUncompTasksByDateCommand {
    public static ShowUncompTasksByDateCommand create() {
        return new ShowUncompTasksByDateCommand();
    }
    
    public void handle() {
        ShowUncompTasksByDate.create().handle(Application.getInstance().getTaskList(), Ask.create().askDate());
    }
}
