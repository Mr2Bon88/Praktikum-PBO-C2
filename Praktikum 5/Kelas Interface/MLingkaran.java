/*
 * File : MLingkaran.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : Implementasi cara menghitung luas lingkaran dengan menerima input jejari dari pengguna
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}