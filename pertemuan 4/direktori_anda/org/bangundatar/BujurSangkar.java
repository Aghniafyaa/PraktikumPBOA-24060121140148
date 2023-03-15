/**
* File: BujurSangkar.java 15/03/2023
* Penulis : Aghnia Alifya Kamila
* Deskripsi : representasi dari objek Bujur Sangkar turunan kelas poligon 
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = 4;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}
