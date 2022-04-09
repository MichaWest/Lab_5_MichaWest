package ru.michawest.itmo.lab_5.inputManager;

import ru.michawest.itmo.lab_5.fileManager.FileWorker;

import java.util.Scanner;

public class FileInput extends InputAll {
    public FileInput(String path) {
        super(new Scanner(new FileWorker(path).read()));
        getScanner().useDelimiter("\n");
    }
}
