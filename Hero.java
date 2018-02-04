package World1;

public class Hero extends Unit{

	public static int health = 25;
	public static int attack = 5;
	public static int speed = 5;
	public static int mana = 20;
	public static int experience = 0;
	
	public Hero(int health, int attack, int speed, int mana, int experience) {
		super(health, attack, speed, mana);
	}
}
