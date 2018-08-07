package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot jinx = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		jinx.setSpeed(500);
		// 5. Set the pen width to 5
		jinx.penDown();
		jinx.setPenWidth(5);
		
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			jinx.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			jinx.turn(90);
		}		
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			jinx.move(100);
			jinx.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



