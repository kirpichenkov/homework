package hw2;

public class Warrior {
    String name;
    int helth;
    int damage;

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                '}';
    }

    public Warrior(String name, int helth, int damage) {
        this.name = name;
        this.helth = helth;
        this.damage = damage;
    }
}
