package ru.michawest.itmo.lab_5.exceptions;

public class InvalidDateFormatException extends ParameterException {
    public InvalidDateFormatException(){
        super("формат даты должен быть HH:mm:ss");
    }
}
