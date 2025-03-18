public class Singleton {
    //lazy approach
    private Singleton(){

    }

    private static Singleton obj;

//    public  static synchronized Singleton getInstance(){
//        if(obj ==null){
//            obj = new Singleton();
//        }
//
//        return obj;
//    }

        public  static  Singleton getInstance(){
        if(obj ==null){
            synchronized (Singleton.class){
                if(obj==null){
                    obj = new Singleton();

                }

            }

        }

        return obj;
    }


    //eager approach
//    private static Singleton obj1 = new Singleton();
//    public static Singleton getInstance1(){
//        return obj1;
//    }
}
