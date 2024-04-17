package hw6Warehouse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Product> hashMapWarehouse = new HashMap<>();
        hashMapWarehouse.put(1, new Product("Banana", "Limpopo", 1));
        hashMapWarehouse.put(2, new Product("Juse", "J7", 5));
        hashMapWarehouse.put(3, new Product("Potato", "Albania", 42));
        hashMapWarehouse.put(4, new Product("Cucumber", "Dacha", 23));
        hashMapWarehouse.put(5, new Product("Tomato", "Tashkent", 52));
        hashMapWarehouse.put(6, new Product("Cabbage", "Sochi", 23));
        hashMapWarehouse.put(7, new Product("Beet", "Chipolino", 86));
        hashMapWarehouse.put(8, new Product("Carrot", "Vietnam", 46));
        hashMapWarehouse.put(9, new Product("Oats", "Kazakhstan", 12));
        hashMapWarehouse.put(10, new Product("Salmon", "Japan", 14));


        //Выведи на экран все ключи продуктов, чье количество больше 5 на складе
        for (Map.Entry<Integer, Product> entry : hashMapWarehouse.entrySet()) {
            if (entry.getValue().getCountInWarehouse() > 5) {
                System.out.println(entry.getKey());
            }
        }

        ArrayList<Integer> keyMyArray = new ArrayList<>();
        keyMyArray.add(5);
        keyMyArray.add(6);
        keyMyArray.add(7);

        changeCount(hashMapWarehouse, keyMyArray);
        System.out.println(hashMapWarehouse.get(5));
        System.out.println(hashMapWarehouse.get(6));
        System.out.println(hashMapWarehouse.get(7));


    }

    //Групповое изменение. Создай метод, который принимает на вход а) Хешмепу с  Ключом - id продукта, а значение Сам Продукт, вторым параметром метод принимает список ключей
    // Тебе надо у продуктов входящий в этих список в этой поданной хешмепе увеличить их количество на складе на 10 единиц
    public static void changeCount(HashMap<Integer, Product> hashMapWarehouse, List<Integer> listKey) {
        for (Integer key : listKey) {
            if(hashMapWarehouse.containsKey(key)){
                Product product = hashMapWarehouse.get(key);
                product.setCountInWarehouse(product.getCountInWarehouse()+10);
            }

        }

    }
}
