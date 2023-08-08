package singleton;

public class Database {
    private static Database db;
    private Database(){

    }

    // Lazy way of creating instance
//    This way doesn't provide a thread safe approach
    public static Database getDB(){
        if(db==null){
            synchronized (Database.class){
                db = new Database();
            }
        }
        return db;
    }
}
