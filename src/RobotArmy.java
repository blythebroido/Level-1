import java.util.Random;

public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human
		Human l = new Human("Abby", 10000);
		Human m = new Human("Albert", 3);
		Human n = new Human("Charlene", 4);
		Human o = new Human("Charlie", 193);
		Human p = new Human("Giselle", 2057);
		Human q = new Human("Garrett", 29);
		Human r = new Human("Ilene", 1);
		Human s = new Human("Isaac", 5);
		Human t = new Human("Katherine", 78);
		Human u = new Human("Kharlie", 485);
		Human v = new Human("Person", 0);
		// 2. create a new Robot army of good and evil robots.
		Robot a = new Robot("a", true, 83);
		Robot b = new Robot("b", true, 37);
		Robot c = new Robot("c", true, 824);
		Robot d = new Robot("d", true, 384);
		Robot e = new Robot("e", true, 3);
		Robot f = new Robot("f", true, 36);
		Robot g = new Robot("g", true, 67);
		Robot h = new Robot("h", true, 3596);
		Robot i = new Robot("i", true, 284);
		Robot j = new Robot("j", true, 385);
		Robot k = new Robot("k", true, 1); 
		a.destroy(l);
		b.destroy(m);
		c.destroy(n);
		d.destroy(o);
		e.destroy(p);
		f.destroy(q);
		g.destroy(r);
		h.destroy(s);
		i.destroy(t);
		j.destroy(u);
		k.destroy(v);

		// 3. command your robot army to destroy a human

	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	int strength = new Random().nextInt();

	public Human(String name, int strength) {
		this.name = name;
		this.isAlive = true;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}


	public int getStrength() {
		return strength;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int strength = new Random().nextInt();

	public Robot(String name, boolean isEvil, int strength) {
		this.name = name;
		this.isEvil = isEvil;
		this.strength = strength;
	}

	public void destroy(Human man) {
		if (man.getStrength() > strength) {
			System.out.println(man.getName() + " won!");
		} 
		else if(man.getStrength() == strength){
			System.out.println(man.getName() + " won!");
		}
		else {
			System.out.println("Oh no! The robot won... " + man.getName() + " died :(");
		}
	}

}
