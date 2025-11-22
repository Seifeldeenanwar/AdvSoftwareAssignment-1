public class Kitchen implements Observer {
    @Override
    public void Update(String Item) {
        System.err.println("The kitchen received the order...Preparing " + Item);
    }

}
