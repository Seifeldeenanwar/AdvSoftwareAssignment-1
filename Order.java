import java.util.List;

public interface Order {
    public void addObserver(Observer odsever);

    public void removeObserver(Observer odsever);

    public void setItem(Item item);

    public List<Item> getListOrder();

    public void notifyObservers(Item Item);

    public Double getTax();

}
