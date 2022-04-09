package ru.michawest.itmo.lab_5.exceptions;

public class InvalidCommandArgumentException extends CommandException{
    public InvalidCommandArgumentException(String s){
        super(s);
    }
}
