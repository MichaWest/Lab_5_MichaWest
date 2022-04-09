package ru.michawest.itmo.lab_5.exceptions;

public class RecursiveException extends FileException {
    public RecursiveException(){
        super("файл уже запущен");
    }
}
