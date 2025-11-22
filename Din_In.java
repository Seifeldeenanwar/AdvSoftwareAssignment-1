import java.util.ArrayList;
import java.util.List;

public class Din_In implements Order {
    private final Double taxe = 10.5;
    private List<Observer> observers;
    private List<String> Items;

    public Din_In() {
        observers = new ArrayList<Observer>();
        Items = new ArrayList<String>();
    }

    @Override
    public void setPaymentMethod(String method) {

    }

    @Override
    public Double getTax() {
        return taxe;
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
    public void setItem(String Item) {
        Items.add(Item);
        notifyObservers(Item);

    }

    @Override
    public List<String> getListOrder() {
        return Items;
    }

    @Override
    public void notifyObservers(String Item) {
        for (Observer obs : observers) {
            obs.Update(Item);
        }

    }

}