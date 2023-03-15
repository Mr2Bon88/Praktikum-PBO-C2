/*
 * File : BujurSangkar.java  (15/03/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : representasi dari objek bujursangkar turunan class poligon
 */


package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this. jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return this.panjangSisi * this.panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}