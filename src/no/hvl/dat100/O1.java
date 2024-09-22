package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 10;) {
			
			i ++;
			
			
			String input = showInputDialog("Antall poeng: ");
			
			int a = Integer.parseInt(input);
			
			String c;
			
			System.out.println(i);
			
			
			if (a > 0 && a < 40) {
				c = "F";
			}
			else if (a >= 40  && a < 50) {
				c = "E";
			}
			else if (a >= 50  && a < 60) {
				c = "D";
			}
			else if (a >= 60  && a < 80) {
				c = "C";
			}
			else if (a >= 80  && a < 90) {
				c = "B";
			}
			else if (a >= 90  && a <= 100) {
				c = "E";
			}
			else {
				System.out.println("Ugyldig, prøv igjen");
				i --;
				c = "ugyldig";
			}
			
			System.out.println("Karakteren til bruker" + i + " er " + c);

		}
	}
}