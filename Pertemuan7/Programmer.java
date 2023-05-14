/**
* Nama File	: Programmer.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Aghnia Alifya Kamila
* NIM		: 24060121140148

**/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus :" + bonus);
    }
}