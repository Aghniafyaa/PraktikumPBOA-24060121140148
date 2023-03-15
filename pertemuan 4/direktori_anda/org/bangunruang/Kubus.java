/**
* File: Kubus.java 15/03/2023
* Penulis : Aghnia Alifya Kamila
* Deskripsi : representasi dari objek Kubus turunan kelas poligon dan BujurSangkar
*/
package org.bangunruang;

import org.poligon.Poligon;
import org.bangundatar.BujurSangkar;

public class Kubus extends Poligon{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi = panjangSisi * panjangSisi* panjangSisi;
	}
	public double hitungLuasAlas(){
		double luasAlas = permukaan.hitungLuas();
		return luasAlas;
	}
	
}