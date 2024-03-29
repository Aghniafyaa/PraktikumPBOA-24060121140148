/**
* File: MPoligon.java 08/03/2023
* Penulis : Aghnia Alifya Kamila
* Deskripsi : driver class untuk poligon dan persegi panjang 
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
	PersegiPanjang persegi = new PersegiPanjang(10,10,4);
	Segitiga segitiga = new Segitiga(5,7,3);
	persegi.printInfo();
	segitiga.printInfo();
	System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	
	BujurSangkar bujur = new BujurSangkar(16,16);
	Kubus kubus = new Kubus(64,64)
	bujur.printInfo();
	kubus.printInfo();
	System.out.println("Luas Bujur Sangkar : "+bujur.hitungLuas());
	System.out.println("Volume Kubus : "+kubus.hitungVolume());
	}
}