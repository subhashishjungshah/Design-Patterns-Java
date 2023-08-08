package singleton;

import java.lang.reflect.Constructor;

public class BreakingSIngleton  {
    public static void main(String[] args) throws Exception{
        Database d1 = Database.getDB();
        Constructor<Database> declaredConstructor = Database.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Database d2 = declaredConstructor.newInstance();
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
