/**
 * Lingkaran.java 25/03/2023
 * Penulis : Aghnia Alifya Kamila
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 *
 */
 
 
 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	 private double jejari;
	 
	 public Lingkaran(double r){
		 jejari = r;
	 }
	 
	 public double hitungLuas(){
        return PI*jejari*jejari;
	 }
 }