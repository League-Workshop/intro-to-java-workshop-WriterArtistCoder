package section3;

import javax.swing.JOptionPane;

public class SpeakAndSpellEasy {

	public static void main(String[] args) {
		String[] spellings = {"schooner", "onomatopoeia", "personality", "circumnavigate", "underwater"};
		String correct = "";
		int right = 0;
		for (int i = 0; i < spellings.length; i++) {
			if (spelledRight(spellings, i)) {
				right++;
			}
		}
		
		speak("You got " + right + "out of " + spellings.length + "right!");
	}
	
	static boolean spelledRight(String[] spellings, int i) {
		String actualSpelling = spellings[i];
		speak("Spell " + actualSpelling);
	// 2. Catch the user's answer in a String
		String userSpelling = JOptionPane.showInputDialog("Well? Go on! Or type \"Repeat\" to repeat the word.");
	// 3. If the user spelled the word correctly speak "correct"
		if (userSpelling.equalsIgnoreCase(actualSpelling)) {
			speak("correct");
			return true;
	// 4. Otherwise say "wrong"
		} else if (userSpelling.equalsIgnoreCase("Repeat")){
			return spelledRight(spellings, i);
		} else {
	// 5. repeat the process for other words
			speak("wrong");
			return false;
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


