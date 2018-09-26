/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Perpustakaan extends JumlahBuku {

    public Perpustakaan(int komik, int novel, int kamus, int biografi, int ilmuPenegetahuan) {
        super(komik, novel, kamus, biografi, ilmuPenegetahuan);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sisa = 0;
        Perpustakaan R = new Perpustakaan(50, 75, 25, 100, 230);
        System.out.println("     === SELAMAT DATANG ===");
        System.out.println("~~~Program Perpustakaan Sekolah~~~");
        
        System.out.println("");
        System.out.println("Ketersediaan Buku");
        System.out.println("Buku Komik = " + R.komik);
        System.out.println("Buku Novel = " + R.novel);
        System.out.println("Buku Kamus = " + R.kamus);
        System.out.println("Buku Biografi = " + R.biografi);
        System.out.println("Buku Ilmu Pengetahuan = " + R.ilmuPengetahuan);
        
        System.out.println("");
        System.out.println("Meminjam Buku = 1. Komik");
        System.out.println("                2. Novel");
        System.out.println("                3. Kamus");
        System.out.println("                4. Biografi");
        System.out.println("                5. Ilmu Pengetahuan");
        int jawab;
        System.out.print("Pilih : ");
        int pinjam = scan.nextInt();
        System.out.print("Jumlah yang dipinjam : ");
        int jumlah = scan.nextInt();
        if (pinjam == 1) {
            sisa = R.komik - jumlah;
        }
        if (pinjam == 2) {
            sisa = R.novel - jumlah;
        }
        if (pinjam == 3) {
            sisa = R.kamus - jumlah;
        }
        if (pinjam == 4) {
            sisa = R.biografi - jumlah;
        }
        if (pinjam == 5) {
            sisa = R.ilmuPengetahuan - jumlah;
        }
        System.out.println("Sisa Buku  : " + sisa);
    }

}
