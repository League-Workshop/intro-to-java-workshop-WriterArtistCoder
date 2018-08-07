package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
		System.out.println("Hello World!");
		Robot jinx = new Robot();
		jinx.miniaturize();
		jinx.setSpeed(1000);
		jinx.penDown();
		int x = 100;
		for (int k = 0; k < 20; k++) {
			for (int j = 0; j < 4; j++) {
				if (j == 3) {
					x-=5;
				}
				jinx.move(x);
				jinx.turn(90);
			}
			x-=5;
		}
		jinx.hide();
	}
}
