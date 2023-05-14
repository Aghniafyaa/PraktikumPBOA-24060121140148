/**
* Nama File	: Manajer.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Aghnia Alifya Kamila
* NIM		: 24060121140148

**/

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+ tunjangan);
    }
}