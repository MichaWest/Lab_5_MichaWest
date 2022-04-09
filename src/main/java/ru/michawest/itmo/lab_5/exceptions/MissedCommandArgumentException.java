package ru.michawest.itmo.lab_5.exceptions;

public class MissedCommandArgumentException extends CommandException {
    public MissedCommandArgumentException(){
        super("пропущен аргумент для команды");
    }
}
