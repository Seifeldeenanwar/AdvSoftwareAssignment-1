public class Waiter implements Observer {
    @Override
    public void Update(Item Item) {
        System.err.println("The waiter received your order... " + Item.getDescription());
    }
}
