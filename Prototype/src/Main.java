
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection("123.67.89.65","Comes from network");
        networkConnection.setImportantdata("This is very important data");
        System.out.println(networkConnection);

        NetworkConnection networkConnection1 =  (NetworkConnection)networkConnection.clone();
        System.out.println(networkConnection1);


    }
}