package com.codebase;

import java.util.ArrayList;

public class Customer {
    ArrayList<Vehicles> customerCollection;

    double wallet;

    public Customer(double wallet, ArrayList<Vehicles> customerCollection) {
        this.wallet = wallet;
        this.customerCollection = new ArrayList<>();
    }

    public void buyVehicle(Vehicles vehicle) {
        this.customerCollection.add(vehicle);
        this.setWallet(this.getWallet() - vehicle.getPrice());
    }

    public ArrayList<Vehicles> getCustomerCollection() {
        return customerCollection;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
