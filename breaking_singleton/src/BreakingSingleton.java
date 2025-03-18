import java.io.Serializable;

public class BreakingSingleton implements Serializable, Cloneable {
    private BreakingSingleton(){
        //Solution of Reflection api. Throw runtime exception in constructor
        if(obj!=null){
            throw new RuntimeException("Obj is created you cannot create another");
        }
        //------------------------------------------------------------------------------//



    }

    private static BreakingSingleton obj;

    public static BreakingSingleton getinstance(){
        if(obj==null){
            obj = new BreakingSingleton();
        }
        return obj;

    }
    //--------------------------------------------------------------------------------//
    //Solution of Serialization and deserialization. By implemented read resolve
    // method serializaton and deserialzation cannot happen

    public Object readResolve(){
        return obj;
    }

    //----------------------------------------------------------------------------------//

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //--------------------------------------------------------------------------//

    //Solution of cloning

    @Override
   public Object clone() throws CloneNotSupportedException {
        return obj;
    }
    //------------------------------------------------------------------------------//
}

//----------------------------------------------------------------------------------------------//
//Solution of reflection api . Instead of class you can use enum so another object cannot be created
//
//public enum BreakingSingleton{
//    INSTANCE;
//}

//------------------------------------------------------------------------------------------------//