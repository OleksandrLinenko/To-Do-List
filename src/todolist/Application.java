/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private TaskList taskList;

    private Application() {

    }
    
    public void reset() {
        taskList.getTasks().clear();
    }

    public static Application getInstance() {
        return app;
    }

    public TaskList getTaskList() {
        return taskList;
    }

}
