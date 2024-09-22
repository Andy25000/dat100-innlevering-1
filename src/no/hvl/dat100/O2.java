package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
	
	public static void main(String[] args) {
		
		
		String input = showInputDialog("Lønn: ");
			
		int a = Integer.parseInt(input);
			
		double c;
	
			
			
		if (a > 208050 && a < 292850) {
			c = 1.7;
		}
		else if (a > 292850 && a <= 670000) {
			c = 4.0;
		}
		else if (a > 670000  && a <= 937900) {
			c = 13.6;
		}
		else if (a > 937900 && a <= 1350000) {
			c = 16.6;
		}
		else if (a > 1350000) {
			c = 17.6;
		}
		else {
			c = 0;
		}
		
		double skatt = a * c / 100;
		
		
		System.out.println("Trinnskatten er " + skatt);
		
	}
}