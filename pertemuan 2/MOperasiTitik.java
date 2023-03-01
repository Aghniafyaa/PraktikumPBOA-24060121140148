/**
* File: MOperasiTitik
* Penulis: Aghnia Alifya Kamila
* Deskripsi:membuat program titik 
*/

public class MOperasiTitik{
	public static void main (String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik o =  new OperasiTitik();
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")"); 
		o.refleksiSumbuX(t);
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiX(t);
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiY(t);
		System.out.println("Titik : ("+t.getAbsis()+", "+t.getOrdinat()+")");
		
	}
}