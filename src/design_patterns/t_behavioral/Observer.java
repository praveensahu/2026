package design_patterns.t_behavioral;

import java.util.ArrayList;
import java.util.List;

interface Observ{
    public void update(String message);
}
interface Subject{
    void addObserver(Observ o);
    void removeObserver(Observ o);
    void notifyObservers();
}
 class NewsChannel implements Subject {
    private List<Observ> oList = new ArrayList<>();
    private String news;
    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }
     @Override
     public void addObserver(Observ o) {
        oList.add(o);
     }

     @Override
     public void removeObserver(Observ o) {
        oList.remove(o);
     }

     @Override
     public void notifyObservers() {
            oList.forEach(e->{
                e.update("update");
            });
     }
 }
class Subscriber implements  Observ{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("updated to all");
    }
}

public class Observer{
    public static void main(String[] args) {
        Observ o1 = new Subscriber("p");
        Observ o2 = new Subscriber("p");

        NewsChannel n = new NewsChannel();
        n.addObserver(o1);
        n.addObserver(o2);
        n.setNews("news");
    }
}