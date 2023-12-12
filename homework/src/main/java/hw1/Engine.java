package hw1;

public class Engine {
    int Durability;

    public Engine(int durability) {
        Durability = durability;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Durability=" + Durability +
                '}';
    }
}
