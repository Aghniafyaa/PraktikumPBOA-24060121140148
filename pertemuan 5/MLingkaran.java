/**
 * MLingkaran.java 25/03/2023
 * Penulis : Aghnia Alifya Kamila
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 *
 */
 
 import java.util.Scanner;
 public class MLingkaran{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan jejari " + r + 
						   " satuan adalah " + l.hitungLuas());
    }
 }
 