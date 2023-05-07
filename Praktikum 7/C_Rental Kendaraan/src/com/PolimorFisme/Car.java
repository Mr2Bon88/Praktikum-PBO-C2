/*
 * File : Car.java  ((07/05/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : 
*/



package com.PolimorFisme;

public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
