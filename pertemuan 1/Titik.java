/**Titik.java 22/02/2023
* Penulis: Aghnia Alifya Kamila
* Deskripsi:membuat program titik 
*/


class Titik{
	double absis; 
	double ordinat;
	static int counterTitik;
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	void setAbsis (double a){
		absis = a;
	}

	void setOrdinat (double o){
		ordinat= o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	double getCounter(){
		return counterTitik;
	}
	

}