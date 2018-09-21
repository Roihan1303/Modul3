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
public class MountainTruck extends Truck {
    public int seatHeight;

    public MountainTruck(int seatHeight, int cadance, int gear, int speed) {
        super(cadance, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    
    public static void main(String[] args) {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);
        MB.speedUp(2);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);   
    }
}
