/**
* File: OperasiTitik
* Penulis: Aghnia Alifya Kamila
* Deskripsi:membuat program titik 
*/

public class OperasiTitik{
	public void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	
	public void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	
	public void refleksiX(Titik t){
		 refleksiSumbuX(t);
	}
	
	public void refleksiY(Titik t){
		 refleksiSumbuY(t);
	}
}