
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection1 networkConnection1 = new NetworkConnection1("123.67.89.65","Comes from network");
        networkConnection1.setImportantdata("This is very important data");
        System.out.println(networkConnection1);
        networkConnection1.getDomains().remove(1);

        NetworkConnection1 networkConnection2 =  (NetworkConnection1)networkConnection1.clone();
        System.out.println(networkConnection2);


        NetworkConnection1 networkConnection3 =  (NetworkConnection1)networkConnection2.clone();
        System.out.println(networkConnection3);



    }
}