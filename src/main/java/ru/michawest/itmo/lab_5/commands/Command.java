package ru.michawest.itmo.lab_5.commands;


import ru.michawest.itmo.lab_5.exceptions.CommandException;
import ru.michawest.itmo.lab_5.exceptions.ParameterException;
import ru.michawest.itmo.lab_5.exceptions.RecursiveException;

public interface Command {
    public void run(String arg) throws CommandException, ParameterException, RecursiveException;
}
