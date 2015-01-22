package pkg.nward.quiz2;

import java.util.Scanner;



public class Display {

	Scanner scan = new Scanner(System.in);
	
	Converter c = new Converter(GetInput());
	
	public int GetInput(){
		System.out.println("Enter miles: ");
		int input = scan.nextInt();
		return input;
	}
	
	public void DisplayResult(){
		System.out.println(c.getMiles() + " miles is " + c.milesToKm() + " Kilometers");
	}
	
	
}
