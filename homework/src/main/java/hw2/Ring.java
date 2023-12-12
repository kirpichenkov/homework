package hw2;

import java.util.Random;

public class Ring {
    public static void UFC(Warrior war1, Warrior war2) {
        while (war1.helth > 0 & war2.helth > 0) {
            Random random = new Random();
            boolean d = random.nextBoolean();
            if (d == true) {
                war2.helth = war2.helth - war1.damage;
                System.out.println(war1.name + " нанес удар");
                System.out.println(war2.name + " осталось" + war2.helth + "здоровья");
            } else {
                war1.helth = war1.helth - war2.damage;
                System.out.println(war2.name + " нанес удар");
                System.out.println(war1.name + " осталось" + war1.helth + "здоровья");
            }
        }
        if (war1.helth == 0) {
            System.out.println(war1 + "победил");
        } else {
            System.out.println(war2 + "победил");
        }
    }
}
