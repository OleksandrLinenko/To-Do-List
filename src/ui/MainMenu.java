/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import todolist.ShowAllTasksByDateCommand;
import todolist.ShowAllTasksCommand;
import todolist.ShowAllUncompletedTasksByDateCommand;
import todolist.ShowAllUncompletedTasksCommand;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    private static Scanner sc = new Scanner(System.in);

    public static MainMenu create() {
        return new MainMenu();
    }

    public void show() {
        boolean endProgram = false;
        do {
            menu();
            int option = getOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    public static void menu() {
        Message.create().show("\nTo-Do-List\n");
        Message.create().show("1. Load new To-Do-List\n");
        Message.create().show("2. Show all tasks\n");
        Message.create().show("3. Show all uncompleted tasks\n");
        Message.create().show("4. Show all tasks from specific date\n");
        Message.create().show("5. Show all uncompleted tasks from specific date\n");
        Message.create().show("6. Add new task\n");
        Message.create().show("7. Mark uncompleted task as completed\n");
        Message.create().show("0. End of program\n");
    }

    public static int getOption() {
        Message.create().show("Pick the option: ");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return - 1;
        }

        return option;
    }

    public static boolean doOption(int option) {
        switch (option) {
            case 0:
                return true;
            case 1:

                break;
            case 2:
                ShowAllTasks();
                break;
            case 3:
                ShowAllUncompletedTasks();
                break;
            case 4:
                ShowAllTasksByDate();
                break;
            case 5:
                ShowAllUncompletedTasksByDate();
                break;
            default:
                Message.create().show("Undefined option");
        }

        return false;
    }

    public static void ShowAllTasks() {
        ShowAllTasksCommand.create().handle();
    }

    public static void ShowAllUncompletedTasks() {
        ShowAllUncompletedTasksCommand.create().handle();
    }

    public static void ShowAllTasksByDate() {
        ShowAllTasksByDateCommand.create().handle();
    }

    public static void ShowAllUncompletedTasksByDate() {
        ShowAllUncompletedTasksByDateCommand.create().handle();
    }
}
