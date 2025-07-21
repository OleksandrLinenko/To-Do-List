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
public class AddTaskCommand {

    public static AddTaskCommand create() {
        return new AddTaskCommand();
    }
    
    public void handle() {
        Application.getInstance().getTaskList().addTask(new Task(Ask.create().askString("Set note: "), States.UNCOMPLETED, Ask.create().askDate()));
    }
}
