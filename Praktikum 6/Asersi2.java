/*
 * File : Asersi2.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/* Pertanyaan 
 * Ada yang kurang tepat pada program Asersi2 di atas?
 */ 
/* Penyelesaian
 * Program Asersi2 telah menggunakan assert untuk mengecek apakah jari-jari lingkaran memiliki nilai yang valid sebelum dihitung kelilingnya. 
 * Namun, ada yang kurang tepat pada program tersebut yaitu nilai jariJari diinisialisasi dengan 0, 
 * sehingga asersi pada baris 8 assert(jariJari>0):"jari jari tidak boleh nol!!!"; akan gagal dan melemparkan AssertionError.
 */