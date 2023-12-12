package hw1;

public class Car {

    String model;
    Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public void startMove(int s) {
        for (int i = 0; i < s / 1000; i++) {
            engine.Durability = engine.Durability - 10;
        }
    }

    public Engine showEngine() {
        System.out.println(engine.Durability);
        return null;
    }
}
