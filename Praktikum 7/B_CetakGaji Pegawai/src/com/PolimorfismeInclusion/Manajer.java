/*
 * File : Manajer.java  (07/05/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : 
*/

package com.PolimorfismeInclusion;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        setNama(nama);
        this.tunjangan = tunjangan;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
