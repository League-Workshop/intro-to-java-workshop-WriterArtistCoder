package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		askEn();
	}

	public static void askEn() {
		// 1. Ask the user if they know how to write code.
		int answer = JOptionPane.showConfirmDialog(null, "Do you know how to unlock the mysteries of laptops and smartphones with coding?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer == 0) {
			JOptionPane.showMessageDialog(null, "Lucky you! You will rule the entire face of the earth, perhaps beyond!");
		} else if (answer == 1) {
		// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null, "Really? Oh well. Good luck washing the dishware, then.");
		} else if (answer == 2) {
			JOptionPane.showMessageDialog(null, "You dare ignore this annoying inquiry? Think again, O bizzare sentient being!");
			askEn();
		}
	}
}

