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
public class LoadListCommand {
    public static LoadListCommand create() {
        return new LoadListCommand();
    }
    
    public void handle() {
        Application.getInstance().reset();
        Data.create().readData(Ask.create().askPath());
    }
}
