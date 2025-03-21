public class NetworkConnection implements  Cloneable{
    private String ip;
    private String importantdata;

    @Override
    public String toString() {
        return ip + " : " + importantdata;
    }

    public NetworkConnection(String ip, String importantdata) {
        this.ip = ip;
        this.importantdata = importantdata;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
