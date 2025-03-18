import javax.management.ObjectName;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        //1 Reflection API
//        BreakingSingleton obj = BreakingSingleton.getinstance();
//        System.out.println(obj.hashCode());
//        Constructor<BreakingSingleton> constructor = BreakingSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        BreakingSingleton obj1 = constructor.newInstance();
//        System.out.println(obj1.hashCode());
//
        // 2 Serilization and Deserialization
//        BreakingSingleton obj = BreakingSingleton.getinstance();
//        System.out.println(obj.hashCode());
//
//
//
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        objectOutputStream.writeObject(obj);
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
//        BreakingSingleton obj1 = (BreakingSingleton) objectInputStream.readObject();
//        System.out.println(obj1.hashCode());

        //3 Object cloning
        BreakingSingleton breakingSingleton = BreakingSingleton.getinstance();
        System.out.println(breakingSingleton.hashCode());

        BreakingSingleton breakingSingleton1 =  (BreakingSingleton) breakingSingleton.clone();
        System.out.println(breakingSingleton1.hashCode());





    }
}