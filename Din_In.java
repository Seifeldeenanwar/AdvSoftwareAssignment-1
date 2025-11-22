import java.util.ArrayList;
import java.util.List;

public class Din_In implements Order {
    // private final Double taxe = 10.5;
    private List<Observer> observers;
    private List<Item> Items;

    public Din_In() {
        observers = new ArrayList<Observer>();
        Items = new ArrayList<Item>();
    }

    @Override
    public Double getTax() {
        return 4.25 ;
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