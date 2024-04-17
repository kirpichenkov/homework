package hw4Paterns.Adapter;

public class DBReader {
    public static void main(String[] args) {
        DB db = new AdapterJavaToDatabase();
        db.insert();
        db.remove();
        db.select();
        db.update();
    }
}
