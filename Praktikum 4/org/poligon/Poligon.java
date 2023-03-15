/*
 * File : Poligon.java  (15/03/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : representasi dasar dari objek poligon
 */


package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public Poligon(){
		this.jumlahSisi = 4;
	}
	
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	};
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	};
}