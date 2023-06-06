/* 
 * File : LambdaHashmap.java  (06/06/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146) 
 * Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
*/

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140146", "Altaf Ariestian Kusuma Rahmat");
        mahasiswaMap.put("24060121150876", "Lebron");
        mahasiswaMap.put("24060121112345", "Curry");
        mahasiswaMap.put("24060121154321", "Jordan");

        // menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}