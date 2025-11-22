public class Kitchen implements Observer {
    @Override
    public void Update(Item Item) {
        System.err.println("The kitchen received the order...Preparing " + Item.getDescription());
    }

}
