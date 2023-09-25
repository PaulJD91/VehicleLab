package com.codebase;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicles> dealershipStock;
    double till;

    public Dealership(double till, ArrayList<Vehicles> dealershipStock) {
        this.till = till;
        this.dealershipStock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void sellVehicle(Vehicles vehicle) {
        this.dealershipStock.remove(vehicle);
        this.setTill(this.getTill() + vehicle.getPrice());
    }

    public void repairVehicle(Vehicles vehicle) {
        vehicle.repairDamage();
    }

    public void sellVehicleToCustomer(Vehicles vehicle, Customer customer) {
        this.sellVehicle(vehicle);
        customer.buyVehicle(vehicle);

    }

    public void addToStock(Vehicles vehicle) {
        this.dealershipStock.add(vehicle);
    }
}
