/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class Truck {
    //the Truck class has three fields
    public int cadance;
    public int gear;
    public int speed;

    public Truck(int cadance, int gear, int speed) {
        this.cadance = cadance;
        this.gear = gear;
        this.speed = speed;
    }
    //the truck class has four methods

    public void setCadance(int cadance) {
        this.cadance = cadance;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    
    public void applybrake(int decrement) {
        this.speed = decrement;
    }

    public void speedUp(int increment) {
        this.speed = increment;
    }
}
