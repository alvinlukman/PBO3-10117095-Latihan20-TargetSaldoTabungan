/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117095.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi : Program ini berisi program untuk menghitung target saldo tabungan
 */
public class PBO310117095Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        int i = 1;

        do {
            saldoAwal = (saldoAwal * bunga) + saldoAwal;
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + saldoAwal);
            i++;
        } while (saldoAwal <= target);
    }
    
}
