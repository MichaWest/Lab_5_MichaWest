package ru.michawest.itmo.lab_5.exceptions;

public class InvalidEnumException extends ParameterException {
    public InvalidEnumException(){
        super("wrong constant");
    }
}
