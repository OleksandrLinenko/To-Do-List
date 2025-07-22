/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author oleksandrlinenko
 */
public class Data {

    public static Data create() {
        return new Data();
    }

    public void readData(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] split = line.split(";");
                String[] splitDate = split[1].split("\\.");
                LocalDate date = LocalDate.of(
                        Integer.parseInt(splitDate[2].trim()),
                        Integer.parseInt(splitDate[1].trim()),
                        Integer.parseInt(splitDate[0].trim())
                );

                State state;
                if (split[3].equals("Completed")) {
                    state = State.COMPLETED;
                } else {
                    state = State.UNCOMPLETED;
                }
                Application.getInstance().getTaskList().addTask(new Task(Integer.parseInt(split[0]), split[2], state, date));
            }
        } catch (IOException ex) {
            System.err.println("Error while reading file");
        }
    }
}
