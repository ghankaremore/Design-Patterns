import java.util.ArrayList;
import java.util.List;

public class Youtubechannel implements  Subject {

    private List<Observer> list = new ArrayList<>();




    public List<Observer> getList() {
        return list;
    }

    public void setList(List<Observer> list) {
        this.list = list;
    }

    @Override
    public void subscribe(Observer ob) {

        list.add(ob);
        System.out.println("Subsriber " +" : "  + "subscribed");


    }

    @Override
    public void unsubscribe(Observer ob) {
        list.remove(ob);
        System.out.println("Subsriber unscribed");

    }

    @Override
    public void videoupload(String video) {
        for(Observer ob : list){
            ob.notified(video);
        }



    }
}
