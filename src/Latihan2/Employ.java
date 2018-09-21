/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author ASUS
 */
class Employ extends Person {

    private String noKaryawan;

    // Konstruktor
    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }

    // Method
    public void info() {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
} // Akhir kelas Employ

