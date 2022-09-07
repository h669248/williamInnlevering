package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Obli3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("skriv inn tallet:"));

	    int x = 1;
	    
		int a = n;
		
		while (n>0) {
			x *=n;
			n--;
		}
		System.out.println(a + "!=" + x);
			 
	
	}

}
