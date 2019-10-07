package fr.dauphine.ja.yanchenge.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection{
	
	private static ArrayList<Integer> numbers;
    
	public PrimeCollection(ArrayList<Integer> numbers) {

		numbers=new ArrayList<Integer>();
	}

	public void initRandom(int n,int m) {
		
		for(int i=0;i<n;i++) {// choisir le chiffre entre i et m
			
			Random  random= new Random();
			
			int nombreAleatoire=random.nextInt(m)+1;
			numbers.add(nombreAleatoire);
			
		}
		}
	
	private static boolean isPrime(int p) {
		
		boolean prime= true;
		
		if(p==0 || p==1) {
		prime=false;
	}
		int i=2;
		while(i<=Math.sqrt(p)&& prime) {
			if (p%i==0) {
				prime=false;
			}
			i++;
			
		}
		
		return prime;
		}
	
	public void printePrime()
	{
		for(int i=0;i<numbers.size();i++) {
			if(isPrime(i)){
				System.out.println(i);
				
			}
			
			
		}
		
	}	
	
    public static void main(String[] args)
    {
    	PrimeCollection pc= new PrimeCollection(numbers);
    	pc.initRandom(1,100);
    
    	
    	
    
    	
    	
       
    }
	
}