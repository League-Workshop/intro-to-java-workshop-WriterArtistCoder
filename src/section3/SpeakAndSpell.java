package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		String[] spellings = {"circumnavigate", "deoxyribonucleic"};
		for (int i = 0; i < spellings.length; i++) {
			String actualSpelling = spellings[i];
			speak("Spell " + actualSpelling);
		// 2. Catch the user's answer in a String
			String userSpelling = JOptionPane.showInputDialog("Well? Go on!");
		// 3. If the user spelled the word correctly speak "correct"
			if (actualSpelling.equals(userSpelling)) {
				speak("correct");
		// 4. Otherwise say "wrong"
			} else {
		// 5. repeat the process for other words
				speak("wrong");
			}
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


