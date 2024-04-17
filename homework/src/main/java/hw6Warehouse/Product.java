package hw6Warehouse;

import java.util.Objects;

public class Product {
    private String name;
    private String manufacter;
    private Integer countInWarehouse;

    public Product(String name, String manufacter, int countInWarehouse) {
        this.name = name;
        this.manufacter = manufacter;
        this.countInWarehouse = countInWarehouse;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public int getCountInWarehouse() {
        return countInWarehouse;
    }

    public void setCountInWarehouse(int countInWarehouse) {
        this.countInWarehouse = countInWarehouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return countInWarehouse == product.countInWarehouse && Objects.equals(name, product.name) && Objects.equals(manufacter, product.manufacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacter, countInWarehouse);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacter='" + manufacter + '\'' +
                ", countInWarehouse=" + countInWarehouse +
                '}';
    }
}
