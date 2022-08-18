package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread pft0=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft1=new PrimeFinderThread(10000001, 20000000);
		PrimeFinderThread pft2=new PrimeFinderThread(20000001, 30000000);

		pft0.start();
		pft1.start();
		pft2.start();
		
	}
	
}
