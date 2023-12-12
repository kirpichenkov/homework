package hw1;

import static hw1.RegenerationEngine.repairEngine;


public class Main {
    public static void main(String[] args) {
        Engine V5 = new Engine(80);
        Engine V3 = new Engine(100);
        Engine V4 = new Engine(50);
        Car bmv = new Car("M5", V5);
        Car bmv2 = new Car("M2", V3);
        Car bmv3 = new Car("M33", V4);
        Car[] car = {bmv, bmv3, bmv2};

        bmv.startMove(2000);
        bmv.showEngine();
        repairEngine(bmv);
        bmv.showEngine();
        System.out.println(repairEngine(car));


    }
}
