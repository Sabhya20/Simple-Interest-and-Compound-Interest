package sab.oop;

import java.util.Scanner;

public class FourthProject {

	public static void main(String[] args) {
		//Variables
		double a;
		double A;
		double t,n,r,p;
		double CI,SI;
		double  diff;
		
		Scanner scan = new Scanner(System.in);
		// Values
		System.out.println("Enter principal");
		p = scan.nextInt();
		System.out.println("Enter Time");
		t = scan.nextInt();
		System.out.println("Enter Rate");
		r = scan.nextInt();	
		
		//line breaker
				System.out.println("");
		
		//CI
		A = p * (Math.pow((1 + r / 100), t));	
		System.out.println("The Compound Interest amount is: "+A);
		CI = A-p;
		System.out.println("The Compound Interest is: "+CI);
		
		//line breaker
		System.out.println("");
		
		//SI 
		SI=p*r*t/100;
		System.out.println("Simple Interest = Rs."+SI);
		a=p+SI;
		System.out.println("Simple interest amount is: "+a);
		
		//line breaker
		System.out.println("");
		
	    //Significance of compound interes
		diff = A-a;
		System.out.println("Difference between amount earned: "+diff );
		
	
		
		

	}

}
