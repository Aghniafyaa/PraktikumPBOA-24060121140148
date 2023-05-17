/**
 * File : ArrayListTest.java
 * Deskripsi : Program penggunaan objek ArrayList sebagai collection class
 */
import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<String>();
        //menambah elemen
        string.add("Praktikum");
        string.add("collection");
        string.add("dan generics");
        //menghapus elemen
        string.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : string){
            System.out.print(s + " ");
        }

    }
}

