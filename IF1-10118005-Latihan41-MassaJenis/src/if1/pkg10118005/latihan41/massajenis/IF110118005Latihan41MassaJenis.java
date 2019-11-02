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
public class IF110118005Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Massa Jenis Kubus=====");
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("Sisi : " + kubus.getSisi() );
        System.out.println("Massa : " + kubus.getMassa()+ "\n");
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " +kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
        
    }
    
}
