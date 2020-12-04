/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119918.andreassuryadi.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan hasil perhitungan
 * saldo tabungan
 * 
 */

public class UTSIF10K10119918ANDREASSURYADINo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int saldoAwal, jumlahDiambil;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        saldoAwal = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        jumlahDiambil = scanner.nextInt();
        
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlahDiambil));
    }
    
}
