/*
 * File : BujurSangkar.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

/*Soal
    Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? jelaskan!
*/
/*Penyelesaian
    Apabila implementeasi metode dari abstrak tidak dibuat maka akan terjadi error , dimana file BujurSangkar tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
*/ 