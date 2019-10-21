package fr.dauphine.ja.yanchenge.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection 
{   
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	
	/*// c'est le constructeur par defaut pour instancier numbers correctement
    public PrimeCollection() {
		super();
		this.numbers = numbers;
	}
    */
    public PrimeCollection(ArrayList<Integer> numbers) {
    	numbers=new ArrayList<Integer>();
    }
    
    //n entiers, m c'est le valeur maximaum
    public void initRandom(int n,int m) {
    	
    	for(int i=0;i<=n;i++) {
    		Random rand=new Random();
    		int nombreAleatoire=rand.nextInt(m)+1;
    		numbers.add(nombreAleatoire);
    	}
    }
    
    public static boolean isPrime(int p) {
    	boolean prime=true;
    	
    	
    	if(p==0||p==1) {
    		prime=false;
    		int i=2;
    		
    		while(i<=Math.sqrt(p)&& prime) {
    			if (p%i==0) {
    				prime=false;
    			}
    			i++;
    			
    		}
    
    	}
    	/*for(int i=2;i<=Math.sqrt(p);i++) {
    		if(p%i==0) return false;
    		}
		return true;*/
		return prime;
  }
    
    
    
    public void printPrimes() {
    	
    	for(int i=0;i<=numbers.size();i++) {
    		if(isPrime(numbers.get(i)))
    			System.out.println(numbers.get(i)+"  c'est un nombre premier");
    		
    	}
    	
    }
    
    
	public static void main( String[] args )
    {
    	
		PrimeCollection pc=new PrimeCollection(numbers);
		pc.initRandom(100,1000);
		pc.printPrimes();
    	
       
    }
}