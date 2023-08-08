package singleton;

public class EagerDB {

//    This is not considered as a good way because this will force making of database
//    Unused object memory allocation which can reduce performance of our system
    private static EagerDB db = new EagerDB();
    private  EagerDB(){}

    public static EagerDB getDB(){
        return db;
    }
}
