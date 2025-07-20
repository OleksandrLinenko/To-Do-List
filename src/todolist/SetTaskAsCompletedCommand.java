/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import ui.Ask;

/**
 *
 * @author oleksandrlinenko
 */
public class SetTaskAsCompletedCommand {

    public static SetTaskAsCompletedCommand create() {
        return new SetTaskAsCompletedCommand();
    }

    public void handle() {
        Task task = Application.getInstance().getTaskList().findTask(Ask.create().askNote(), Ask.create().askDate());
        Application.getInstance().getTaskList().makeCompleted(task);
    }
}
