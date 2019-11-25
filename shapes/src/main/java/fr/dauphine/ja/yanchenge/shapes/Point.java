package fr.dauphine.ja.yanchenge.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point {
	private int x, y;
	private static int nbCmpt;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int px, int py) {
		this.x = px;
		this.y = py;
		nbCmpt++;

	}

	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		nbCmpt++;

	}

	public boolean isSameAs(Point p) {

		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) { // Exercice 1
		/*
		 * Point p=new Point(0,1); System.out.println(p.x+" "+p.y);
		 * 
		 * Point p1 = new Point(5,2); System.out.println(p1.x+" "+p1.y);
		 * 
		 * System.out.println( "on a  " + nbCmpt + " points" );
		 */

		// System.out.println( "Hello World!" );

		// Exercice 2
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
	
	        System.out.println(p1==p2);
	        System.out.println(p1==p3);
	       
	        System.out.println(p1.isSameAs(p2));
	        System.out.println(p1.isSameAs(p3));
		
	
		
		
		
		ArrayList<Point>list =new ArrayList <Point> ();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
}