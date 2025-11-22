public class Waiter implements Observer {
    @Override
    public void Update(String Item) {
        System.err.println("The waiter received your order... " + Item);
    }
}
