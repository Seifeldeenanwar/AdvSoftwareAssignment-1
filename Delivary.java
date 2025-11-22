import java.util.ArrayList;
import java.util.List;

public class Delivary implements Order {
    // private final Double taxe = 20.2;
    private List<Observer> observers;
    private List<Item> Items;

    public Delivary() {
        observers = new ArrayList<Observer>();
        Items = new ArrayList<Item>();
    }


    @Override
    public Double getTax() {
        return 3.5 ;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void setItem(Item Item) {
        Items.add(Item);
        notifyObservers(Item);

    }

    @Override
    public List<Item> getListOrder() {
        return Items;
    }

    @Override
    public void notifyObservers(Item Item) {
        for (Observer obs : observers) {
            obs.Update(Item);
        }

    }
}
