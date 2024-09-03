package org.example;

class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) throws InvalidYearException {
        if (year > 2024) {
               throw new InvalidYearException ("tahun tidak boleh lebih besar dari 2024: " + year);
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract String vehicleSound();

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) throws InvalidYearException {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String vehicleSound() {
        return "Broom Broom! (Car)";
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numOfDoors;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) throws InvalidYearException {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String vehicleSound() {
        return "Broom Broom! (Motorcycle)";
    }

    @Override
    public String toString() {
        return super.toString() + ", Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}

public class TugasPolyMorphism {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        try {
                vehicles[0] = new Car("Toyota", "Corolla", 2020, 4);
                vehicles[1] = new Motorcycle("Honda", "Beat", 2022, false);

        }catch (InvalidYearException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (Vehicle vehicle : vehicles) {
                System.out.println("Vehicle: " + vehicle);
                System.out.println("Sound: " + vehicle.vehicleSound());
        }
    }
}