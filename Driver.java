public class Driver implements Observer {
    @Override
    public void Update(String Item) {
        System.err.println("The driver received the order... " + Item + "\nI'm on my way ..");
    }
}
