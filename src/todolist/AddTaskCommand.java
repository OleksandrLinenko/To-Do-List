/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.time.LocalDate;
import ui.Ask;



/**
 *
 * @author oleksandrlinenko
 */
public class AddTaskCommand {

    public static AddTaskCommand create() {
        return new AddTaskCommand();
    }
    
    public void handle() {
        String note = Ask.create().askString("Set note: ");
        LocalDate date = Ask.create().askDate();
        Application.getInstance().getTaskList().addTask(new Task(note, States.UNCOMPLETED, date));
    }
}
