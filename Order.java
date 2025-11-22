import java.util.List;

public interface Order {
    public void addObserver(Observer odsever);

    public void removeObserver(Observer odsever);

    public void setItem(String Item);

    public List<String> getListOrder();

    public void notifyObservers(String Item);

    public Double getTax();

    public void setPaymentMethod(String method);
}
