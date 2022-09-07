package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Obli1 {
	
	public static void main(String[] args) {
		int bruttoinntekt = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt her:"));
				
		int trinn1 = 164101;
		int trinn2 = 230951;
		int trinn3 = 580651;
		int trinn4 = 934051;
		
		double trinn1sats = 0.0093;
		double trinn2sats = 0.0241;
		double trinn3sats = 0.1152;
		double trinn4sats = 0.1452;
		
		int skatt = 0;
		
		if ((bruttoinntekt >= trinn1) && (bruttoinntekt < trinn2)) {
			 skatt += (bruttoinntekt)*trinn1sats;
			
		} 
		if ((bruttoinntekt >= trinn2) && (bruttoinntekt < trinn3)) {
			skatt += (bruttoinntekt)*trinn2sats;
			
		} 
		if ((bruttoinntekt >= trinn3) && (bruttoinntekt < trinn4)) {
			skatt += (bruttoinntekt)*trinn3sats;
			
		}
		if (bruttoinntekt >= trinn4) {
			skatt += (bruttoinntekt)* trinn4sats;
		}
			int nettoinntekt = bruttoinntekt - skatt;
			
			System.out.println("Bruttoinntekt: " + bruttoinntekt + "kr");
			System.out.println("skatt: " + skatt + "kr");
			System.out.println("Nettoinntekt: " + nettoinntekt + "kr");

	}
}