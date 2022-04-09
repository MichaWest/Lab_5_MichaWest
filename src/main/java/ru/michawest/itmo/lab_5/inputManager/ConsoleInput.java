package ru.michawest.itmo.lab_5.inputManager;

import ru.michawest.itmo.lab_5.data.*;
import ru.michawest.itmo.lab_5.exceptions.*;

import java.util.Scanner;

public class ConsoleInput extends InputAll {

    public ConsoleInput() {
        super(new Scanner(System.in));
        getScanner().useDelimiter("\n");
    }

    @Override
    public Person readPerson() throws ParameterException {
        String name = readName();
        Coordinates coordinates = readCoordinates();
        java.time.LocalTime createTime = readCreateTime();
        double height = readHeight();
        long weight = readWeight();
        Color hairColor = readHairColor();
        Country nationality = readNationality();
        Location location = readLocation();
        return new Person(name, coordinates, createTime, height, weight, hairColor, nationality, location);
    }

    public String readName() throws EmptyStringException {
        System.out.print("enter name: ");
        return super.readName();
    }

    @Override
    public Coordinates readCoordinates() throws InvalidNumberException {
        float x = readXCoordinate();
        float y = readYCoordinate();
        Coordinates c = new Coordinates();
        c.addCoordinates(x, y);
        return c;
    }

    @Override
    public float readXCoordinate() throws InvalidNumberException {
        System.out.print("enter x coordinate: ");
        return super.readXCoordinate();
    }

    @Override
    public float readYCoordinate() throws InvalidNumberException {
        System.out.print("enter y coordinate: ");
        return super.readYCoordinate();
    }

    @Override
    public java.time.LocalTime readCreateTime() throws InvalidDateFormatException {
        System.out.print("enter create time: ");
        return super.readCreateTime();
    }

    @Override
    public double readHeight() throws InvalidNumberException {
        System.out.print("enter height: ");
        return super.readHeight();
    }

    @Override
    public long readWeight() throws InvalidNumberException {
        System.out.print("enter weight: ");
        return super.readWeight();
    }

    @Override
    public Color readHairColor() throws InvalidEnumException {
        System.out.print("enter hair color (RED, BROWN, YELLOW): ");
        return super.readHairColor();
    }

    @Override
    public Country readNationality() throws InvalidEnumException {
        System.out.print("enter nationality (USA, CHINA, VATICAN, NORTH_KOREA, JAPAN): ");
        return super.readNationality();
    }

    @Override
    public Location readLocation() throws InvalidNumberException {
        double x = readXLocation();
        long y = readYLocation();
        double z = readZLocation();
        Location location = new Location();
        location.addLocation(x, y, z);
        return location;
    }

    @Override
    public double readXLocation() throws InvalidNumberException {
        System.out.print("enter x location: ");
        return super.readXLocation();
    }

    @Override
    public long readYLocation() throws InvalidNumberException {
        System.out.print("enter y location: ");
        return super.readYLocation();
    }

    @Override
    public double readZLocation() throws InvalidNumberException {
        System.out.print("enter z location: ");
        return super.readZLocation();
    }
}