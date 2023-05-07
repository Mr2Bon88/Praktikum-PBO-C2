/*
 * File : Pegawai.java  (07/05/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : 
*/


package com.PolimorfismeInclusion;

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.printf("Nama: %s, Gaji pokok : %d\n", nama, gajiPokok);
    }
}
