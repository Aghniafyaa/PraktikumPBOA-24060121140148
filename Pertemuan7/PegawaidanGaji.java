/**
* Nama File	: PegawaidanGaji.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Aghnia Alifya Kamila
* NIM		: 24060121140148

**/

public class PegawaidanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Andi");
        Pegawai pegawai2 = new Manajer("Reno");
        Pegawai pegawai3 = new Manajer("Arya");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);



    }
}