package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot jinx = new Robot();
		// 3. Put the robot's pen down
		jinx.penDown();
		// 8. Make the robot go at maximum speed (100)
		jinx.setSpeed(500);
		// 9. Set the pen to a color that you like for the shape
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int sides = 4;
		int r = 250;
		int g = 250;
		int b = 250;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6
		int angle = 360/sides;
		int i = 1;
		jinx.hide();
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you should see a pentagon
		for (int j = 0; j < 120; j++) {
			jinx.setPenColor(r, g, b);
			// 2. Move the robot 200 pixels
			jinx.move(i+j);
			// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
			
			// 6. Turn the robot the amount in your angle variable
			jinx.turn(angle);
			// 11. Turn the robot one more degree
			jinx.turn(1);
			if (b > 0 && g > 0) {
				b-=10;
				jinx.setPenWidth(i+1);
				i++;
			} // Now it's white -> yellow
			
			if (g > 0 && b <= 0) {
				g-=10;
				jinx.setPenWidth(i+1);
				i++;
			} // Now it's yellow -> red
			
			if (g <= 0 && r > 0) {
				r-=10;
				b+=10;
				jinx.setPenWidth(i+1);
				i++;
			} // Now it's red -> blue
			
			if (r <= 0 && g <= 0) {
				b-=10;
				jinx.setPenWidth(i+1);
				i++;
			}
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
