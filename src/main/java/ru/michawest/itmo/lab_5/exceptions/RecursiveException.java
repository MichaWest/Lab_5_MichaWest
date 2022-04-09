package ru.michawest.itmo.lab_5.exceptions;

public class RecursiveException extends FileException {
    public RecursiveException() {
        super("file is already run");
    }
}
