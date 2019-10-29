/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan60.akatsuki;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * Kelas        : PBO11K
 * NIM          : 10118901
 * Deskripsi Program : Explorasi Akatsuki dengan konsep overloading dan pewarisan
 * 
 */
public class PBO11K10118901Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Anggota Akatsuki Berdasarkan Desa");
        System.out.println("");
        Senjata hidan = new Senjata();
        hidan.setNama("Hidan");
        hidan.jenisPetarung("Sabit");
        hidan.asalDesa("Iwagakure");
        TanganKosong nagato = new TanganKosong();
        nagato.setNama("Nagato");
        nagato.jenisPetarung();
        nagato.asalDesa("Amegakure");
    }
    
}
