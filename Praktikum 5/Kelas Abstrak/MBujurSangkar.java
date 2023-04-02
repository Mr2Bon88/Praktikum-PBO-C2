/*
 * File : MBujurSangkar.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : kelas yang mengimplementasi cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}