package hw4Paterns.Adapter;

public class AdapterJavaToDatabase extends JavaApllication implements DB {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
    updateObject();
    }

    @Override
    public void select() {
    loadObject();
    }

    @Override
    public void remove() {
    deleteObject();
    }
}
