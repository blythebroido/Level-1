import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* Copyright Wintriss Technical Schools 2014
 Need Gridworld handouts (4 handouts with descriptions of World, Bug, Grid and Location objects. look for laminated sheets.)

In this exercise we’ll use OBJECTS and METHODS to make a world that contains bugs and flowers.

0. Download the Gridworld JAR. 
1. Make a new Java Project and add this JAR to it.
Right click your project and add it as an External JAR (Under Java Build Path > Libraries).
2. Figure out how to get the World to show.
3. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
4. Add another bug at a random location in the world.
5. Change the color of that bug to blue.
6. Make the bug face to the right.
7. Add flowers to the left and right of the bug.
8. Fill the whole world with flowers!
*9. [Optional] Color the flowers in rows like the American flag (red & white)
*10. [Optional] Use a new class to make an X out of bugs.
*/

public class LearningGridworld {
	public static void main(String[] args) {
			World world = new World();
			world.show();
			world.add(new Location(1, 7), new Flower());
	}
}
