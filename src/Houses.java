import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	static int height;
	public static void main(String[] args) {
		Tortoise.setPenWidth(5);
		Tortoise.show();
		Tortoise.setX(0);
		Tortoise.setY(425);
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(-90);
		Tortoise.penDown();
		drawHouse("medium");
		drawHouse("small");
		drawHouse("large");
		drawHouse("small");
		drawHouse("medium");
		drawHouse("large");
		drawHouse("medium");
		drawHouse("small");
		drawHouse("large");
	}

	static void drawHouse(String sizes) {
		if (sizes.equals("small")) {
			height = 60;
		}
		if (sizes.equals("medium")) {
			height = 120;
		}
		if(sizes.equals("large")){
			height = 250;
		}
		int r = new Random().nextInt(2);
		Tortoise.move(height);
		if(r == 0){
			drawPointyRoof();
		}
		else{
			drawStraightRoof();
		}
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		Tortoise.move(50);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.turn(-90);
	}

	private static void drawStraightRoof() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
	}

	static void drawPointyRoof() {
		Tortoise.turn(45);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(45);
	
	
	}
}
