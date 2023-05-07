/*
 * File : Programmer.java  ((07/05/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : 
*/


package com.PolimorfismeInclusion;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
        this.bonus = bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
