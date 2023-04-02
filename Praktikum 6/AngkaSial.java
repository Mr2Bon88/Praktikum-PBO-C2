/*
 * File : AngkaSial.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
 * Deskripsi : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/* Pertanyaan
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 */
/* Penyelesaian: 
 * Ketika eksepsi AngkaSialException terjadi pada pemanggilan metode cobaAngka(13), baris 12 tidak akan dieksekusi. 
 * Baris 21 akan dieksekusi karena catch menangkap eksepsi AngkaSialException yang dilemparkan oleh metode cobaAngka() dan mencetak pesan kesalahan dan peringatan pada konsol. 
 * Kemudian program akan keluar dari blok catch dan melanjutkan eksekusi setelahnya, yaitu mencetak "12 bukan angka sial" pada konsol.
 */