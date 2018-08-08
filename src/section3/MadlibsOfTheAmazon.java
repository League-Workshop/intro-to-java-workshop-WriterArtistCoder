package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you ever have to cross a pihrana-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String arg1 = JOptionPane.showInputDialog("Adjective, please! (e.g. Googley)");
		// Get the user to enter a type of liquid
		String arg2 = JOptionPane.showInputDialog("Liquid, por favor! (e.g. Java)");
		// Get the user to enter a body part
		String arg3 = JOptionPane.showInputDialog("Have a body part? (e.g. webcam)");
		// Get the user to enter a verb
		String arg4 = JOptionPane.showInputDialog("Know a present-tense verb? (e.g. debug)");
		// Get the user to enter a place
		String arg5 = JOptionPane.showInputDialog("How about a place? (e.g. mozilla.org)");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String story = "Piranhas are more " + arg1 + " during the day, so cross the river at\n night. Piranhas are attracted to fresh "
		+ arg2 + " and will most likely\n take a bite out of your " + arg3 + " if you " + arg4 + ".\n Whatever you do, if you have an open"
				+ " wound, try to find another way\n to get back to the " + arg5 + ". Good luck!";
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, story);

	}
}

