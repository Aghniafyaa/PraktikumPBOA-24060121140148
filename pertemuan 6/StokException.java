/**
* Nama File	: StokException.java 
* Penulis	: Aghnia Alifya Kamila
* NIM		: 24060121140148
* Deskripsi	: Kelas StokException merupakan kelas turunan dari kelas Exception

**/

public class StokException extends Exception {
    public StokException(Barang barang){
        // TODO 5
		super("Stok barang "+ barang.getNamaBarang() + "(" + barang.getIdBarang() + ")" + "Tidak Cukup!");
    }
}

