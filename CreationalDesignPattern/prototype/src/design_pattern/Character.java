package design_pattern;

public class Character implements Prototype{
	private String name;
    private int health;
    private int power;

    // Constractor
    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // copy method
    @Override
    public Prototype clone() {
        return new Character(this.name, this.health, this.power);
    }

    @Override
    public String toString() {
        return "Character: " + name + ", Health: " + health + ", Power: " + power;
    }
}
