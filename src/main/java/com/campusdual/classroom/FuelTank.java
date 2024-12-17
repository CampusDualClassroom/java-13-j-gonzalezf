package com.campusdual.classroom;

public class FuelTank {

    private int actualFuel = 10;

    public void showDetails() {
        System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
    }

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel < 0) {
            System.out.println("La capacidad actual no debe tomar valores negativos");
        } else {
            this.actualFuel = actualFuel;
        }
    }

}
