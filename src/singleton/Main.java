package singleton;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getDB();
        Database db1  = Database.getDB();

        System.out.println(db.hashCode());
        System.out.println(db1.hashCode());
    }
}
