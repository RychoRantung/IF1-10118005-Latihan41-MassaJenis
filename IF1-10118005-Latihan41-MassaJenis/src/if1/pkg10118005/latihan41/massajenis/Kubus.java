/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan41.massajenis;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menghitung massa jenis kubus
 */
public class Kubus {
    private int sisi, massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    public int hitungVolume(int parSisi){
       int  volume;
        return volume = sisi * sisi * sisi;
    }
    public int hitungMassaJenis(int parMassa, int volume){
        return massa / volume;
    }
}
