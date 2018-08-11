package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		while (true) {
			int lamenessValue = new Random().nextInt(5);
			String userPassion = JOptionPane.showInputDialog("O bizzare sentient being, I, a lowly collection of energy, data,\n and metal, ask you to input one thing that you think is awesome.");
			System.out.println(lamenessValue);
			if (lamenessValue == 0) {
				JOptionPane.showMessageDialog(null, "You have enlightned me! " + userPassion + " IS awesome.");
			} else if (lamenessValue == 1) {
				JOptionPane.showMessageDialog(null, "I remain neutral on " + userPassion + ", conscious being.\n I cannot say I am enlightened.");
			} else if (lamenessValue == 2) {
				JOptionPane.showMessageDialog(null, userPassion + " is not my passion.\n I declare it \"boring\", a TIME-SWALLOWER.");
			} else if (lamenessValue == 3) {
				JOptionPane.showMessageDialog(null, "What? " + userPassion + ", awesome? Conscious creature,\n are you sure? That practice must be terminated!\n ARGGHLSCHLMMKKKZAAAGH!");
			} else if (lamenessValue == 4) {
				JOptionPane.showMessageDialog(null, "Wow! You have simply filled me with emotion! " + userPassion + " is a Google-worthy practice!\n I think I am more human! Maybe even human enough to beat that annoying\n RE-CAPTCHA that shows up when I try to join Facebook!");
			}
		}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


