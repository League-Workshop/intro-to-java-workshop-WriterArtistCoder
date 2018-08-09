package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 180;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 180;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack = 0;
		int playerYells = 0; // My idea
		int playerKicks = 0; // My idea
		int trendTime = 2; // Time it takes for an attack to be a trend
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonAttack = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		while (playerHealth > 0 && dragonHealth > 0) {
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
			int playerAction = 2;
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
			while (playerAction == 2) {
				playerAction = JOptionPane.showConfirmDialog(null, "Yell (YES) or kick (NO) to attack dragon?");
		// 9. If they typed in "yell":
				if (playerAction == 0) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
					playerAttack = new Random().nextInt(2)+5;
			//-- Subtract that number from the dragon's health variable 
					dragonHealth -= playerAttack;
					if (playerKicks > (playerYells+(trendTime-1))) {
						dragonHealth -= playerAttack*(((playerKicks-playerYells)-trendTime)+1);
						playerAttack *= (((playerKicks-playerYells)-trendTime)+2);
						JOptionPane.showMessageDialog(null, (((playerKicks-playerYells)-trendTime)+2) + "x damage! You surprised the dragon by\n breaking your attack trend. You also gained 70 health.");
						playerHealth+=70;
					}
					playerYells++;
		// 10. If they typed in "kick":
				} else if (playerAction == 1) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
					playerAttack = new Random().nextInt(11)+5;
			//-- Subtract that number from the dragon's health variable
					dragonHealth -= playerAttack;
					if (playerYells > (playerKicks+(trendTime-1))) {
						dragonHealth -= playerAttack*(((playerYells-playerKicks)-trendTime)+1);
						playerAttack *= (((playerYells-playerKicks)-trendTime)+2);
						JOptionPane.showMessageDialog(null, (((playerYells-playerKicks)-trendTime)+2) + "x damage! You surprised the dragon by\n breaking your attack trend. You also gained 70 health.");
						playerHealth+=70;
					}
					playerKicks++;
				}
			}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
			dragonAttack = new Random().nextInt(21)+5;
		// 12. Subtract this number from the player's health
			playerHealth -= dragonAttack;
		
		
		// 13. If the user's health is less than or equal to 0
			if (playerHealth <= 0) {
			//-- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You are unconscious! You wake up in a land\n far from the cave, far from home. There is\n nothing but plains around you and you\n set up camp and have a life with the\n deer and birds.");
				break;
			} else if (dragonHealth <= 0) {
				int gold = new Random().nextInt(20)+30;
				JOptionPane.showMessageDialog(null, "The dragon is unconscious! You take $" + gold + "K, and hurry back home.");
				break;
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			} else {
	   //  15.  Else
				JOptionPane.showMessageDialog(null, "Keep fighting!\n Your health: " + playerHealth + " after " + dragonAttack + " damage this round" + "\n Dragon's health: " + dragonHealth + " after " + playerAttack + " damage this round");
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			}
		}	
	}
}
