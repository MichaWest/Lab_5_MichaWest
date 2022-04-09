package ru.michawest.itmo.lab_5.exceptions;

public class NoSuchCommandException extends CommandException {
    public NoSuchCommandException() {
        super("wrong command");
    }
}
