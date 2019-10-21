package fr.dauphine.ja.yanchenge.shapes;

/**
 * Hello world!
 *
 */
public class Point 
{   
    private int x,y;
    
    
	
  
    public int getX() {
		return x;
	}




	public int getY() {
		return y;
	}
	  
  public Point(int x,int y) {
    	this.x=x;
        this.y=y;
    }



	public static void main( String[] args )
    {  //question 1
		Point p=new Point(0,0);
		System.out.println(p.x+" "+p.y);
		
		
		
		
        System.out.println( "Hello World!" );
    }
}
