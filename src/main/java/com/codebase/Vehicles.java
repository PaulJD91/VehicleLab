package com.codebase;


public class Vehicles {

    double damage;
    double price;
    String colour;
    String make;
    String model;
    Engine engine;
    Tyre tyre;

    public Vehicles(double damage, double price, String colour, String make, String model, Engine engine, Tyre tyre) {
        this.damage = 0d;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyre = tyre;
    }

    public void addDamage(double vehicleDamage) {
        this.damage += vehicleDamage;
    }

    public void repairDamage() {
        this.damage = 0d;
    }

    public double getPrice() {
        return price;
    }

    public double getDamage() {
        return damage;
    }

    public double getDamagePrice() {
        return this.getPrice() - this.getDamage();
    }
}
