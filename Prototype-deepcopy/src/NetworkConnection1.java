import java.util.ArrayList;
import java.util.List;

public class NetworkConnection1 implements  Cloneable{
    private String ip;
    private String importantdata;

    private List<String> domains = new ArrayList<>();
    @Override
    public String toString() {
        return ip + " : " + importantdata + " : " + domains;
    }


    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public NetworkConnection1(String ip, String importantdata) {
        this.ip = ip;
        this.importantdata = importantdata;
        this.domains.add("www.ghanshyam.com");
        this.domains.add("www.shraddha.com");
        this.domains.add("www.dnyanesh.com");
        this.domains.add("www.sandesh.com");
        this.domains.add("www.sarvesh.com");
        this.domains.add("www.gaurav.com");
    }

    public String getIp() {
        return ip;
    }

    public NetworkConnection1() {

    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection1 networkConnection1 = new NetworkConnection1();
        networkConnection1.setIp(this.ip);
        networkConnection1.setImportantdata(this.getImportantdata());
        for(String str : this.getDomains()){
            networkConnection1.getDomains().add(str);
        }
        return networkConnection1;
    }

    public String getImportantdata() {
        return importantdata;
    }

    public void setImportantdata(String importantdata) {
        this.importantdata = importantdata;
    }

    public void loaddata(){
        this.importantdata = "This is very important data";
    }
}
