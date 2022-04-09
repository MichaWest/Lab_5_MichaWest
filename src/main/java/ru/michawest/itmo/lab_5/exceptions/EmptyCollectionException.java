package ru.michawest.itmo.lab_5.exceptions;

public class EmptyCollectionException extends CommandException{
    public EmptyCollectionException(){
        super("collection is empty");
    }
}
