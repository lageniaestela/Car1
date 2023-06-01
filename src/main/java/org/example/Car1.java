package org.example;

public class Car1 {
    private int fuel;
    private int speed;
    private String modelo;

    public void Car1(){

    }
    public void Car1(int x, int y, String mod) {
    this.fuel=x;
    this.speed=y;
    this.modelo=mod;

    }
 public void mostrarauto(int x, int y, String mod){
        this.fuel=x;
        this.speed=y;
        this.modelo=mod;
     System.out.println(getFuel());
     System.out.println(getSpeed());
     System.out.println(getModelo());
 }
    public int getFuel() {
        return fuel;
    }

    public int setFuel(int fuel) {
        this.fuel = fuel;
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarauto() {
    }
}


