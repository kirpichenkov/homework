package hw1;

public class RegenerationEngine {
    public static void repairEngine(Car car) {
        car.engine.Durability = 100;
    }

    public static Car repairEngine(Car[] carArray) {

        Car car = new Car("testla", new Engine(100));
        for (Car c : carArray) {
            if (c.engine.Durability < car.engine.Durability) {
                car = c;
            }
        }

        return car;
// певроночальынй варинт - не получался без объявления переменной car
//        Car car1 = null;
//        for (int i = 0; i < carArray.length; i++) {
//            Car car = new Car("testla", new Engine(100))  ;
//            if (carArray[i].engine.Durability < car.engine.Durability ) {
//                car = carArray[i];
//                car1 = car;
//            }
//        }
//        return car1;
//    }
    }
}
