package ru.michawest.itmo.lab_5.exceptions;

public class CannotCreateFileException extends FileException{
    public CannotCreateFileException(){
        super("немогу создать файл");
    }
}
