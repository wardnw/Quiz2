package pkg.nward.quiz2;

public class Converter {

	private int miles;
	private int kilometers;
	
	public Converter(int m){
		miles = m;
	}
	
	
	public int getMiles(){
		return miles;
	}
	
	public void setMiles(int m){
		miles = m;
	}

	public int getKm(){
		return kilometers;
	}

	public void setKm(int k){
		kilometers = k;
	}
	
	public double milesToKm(){
		double result = miles * 2.7;
		return result;
	}
	
	
}
