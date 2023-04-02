/*
 * File : ExceptionOnArray.java  (02/04/2023)
 * Penulis : Altaf Ariestian Kusuma Rahmat (24060121140146)
* Deskripsi : Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}