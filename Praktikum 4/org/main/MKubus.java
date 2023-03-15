/*
 * File : MKubus.java  (15/03/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : driver class untuk poligon dan kubus
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
  public static void main(String[] args){
    BujurSangkar bujursangkar = new BujurSangkar(4);
	Kubus kubus = new Kubus(bujursangkar);
	System.out.println("Luas Alas Kubus = " + kubus.hitungLuasAlas() + "\n");
	System.out.println("Volume Kubus = " + kubus.hitungVolume());
  }
}