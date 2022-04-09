package ru.michawest.itmo.lab_5;
import java.io.*;

import ru.michawest.itmo.lab_5.commands.CommandExecutor;
import ru.michawest.itmo.lab_5.fileManager.*;
import ru.michawest.itmo.lab_5.collection.*;
import ru.michawest.itmo.lab_5.inputManager.ConsoleInput;
import ru.michawest.itmo.lab_5.inputManager.InputAll;

public class Main {
    public static void main (String[] args) throws Exception{
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        FileWorker fileWorker = new FileWorker();
        PersonCollection personCollection = new PersonCollection();
        String path = "MICHELLE";
        fileWorker.setPath(path);
        if(!personCollection.deserializeCollection(fileWorker.read())){
            System.out.println("In the fail is a error");
            personCollection.clear();
        }
        InputAll console = new ConsoleInput();
        CommandExecutor command = new CommandExecutor(personCollection, console, fileWorker);
        command.consoleMode();
    }
}
