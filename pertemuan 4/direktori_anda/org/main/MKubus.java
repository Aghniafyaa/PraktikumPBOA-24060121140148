/**
* File: MKubus.java 15/03/2023
* Penulis : Aghnia Alifya Kamila
* Deskripsi : driver class untuk Kubus dan Bujur Sangkar
*/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
	BujurSangkar bujurSangkar = new BujurSangkar(4.0);
	Kubus kubus = new Kubus(bujurSangkar);
	
	System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	System.out.println("Volume Kubus : "+kubus.hitungVolume());
	
	}
}