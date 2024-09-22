package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	
	public static void main(String[] args) {
		
		
		String input = showInputDialog("Skriv et heltall for n: ");
			
		int n = Integer.parseInt(input);
			
		int f = 1;
		
		
		if (n > 0) {
			
			for (int i = 1; i <= n; i++) {
			
				f *= i;
			}
		
		System.out.println("n! er lik " + f);
	
		}
		else {
			
			System.out.println("Ugyldig");
			
		}			
	}
}