/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class JumlahBuku {

    public int komik;
    public int novel;
    public int kamus;
    public int biografi;
    public int ilmuPengetahuan;

    public JumlahBuku(int komik, int novel, int kamus, int biografi, int ilmuPengetahuan) {
        this.komik = komik;
        this.novel = novel;
        this.kamus = kamus;
        this.biografi = biografi;
        this.ilmuPengetahuan = ilmuPengetahuan;

    }

    public void setKomik(int komik) {
        this.komik = komik;
    }

    public void setNovel(int novel) {
        this.novel = novel;
    }

    public void setKamus(int kamus) {
        this.kamus = kamus;
    }

    public void setBiografi(int biografi) {
        this.biografi = biografi;
    }

    public void setIlmuPengetahuan(int ilmuPengetahuan) {
        this.ilmuPengetahuan = ilmuPengetahuan;
    }

}
