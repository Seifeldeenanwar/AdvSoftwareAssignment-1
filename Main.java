public class Main {
    public static void main(String args[]){
        Item extracheeseItalianpizza = new ExtraCheese(new NonVegItalianPizza()) ;
        Item ExtraOnionVegClassicBurger = new ExtraOnion(new VegItalianPizza()) ;
        Item extracheeseclassickidsburger = new ExtraCheese(new KidClassicBurger()) ;
        Order order = new Din_In() ;
        Observer waiter = new Waiter();
        Observer kitchen = new Kitchen() ;
        order.addObserver(kitchen);
        order.addObserver(waiter) ;
        order.setItem(ExtraOnionVegClassicBurger);
        order.setItem(extracheeseItalianpizza);
        order.setItem(extracheeseclassickidsburger);
        ResturantService Rs = new ResturantService() ;
        Menu vegMenu = new VegMenu() ;
        Menu NonVegMenu = new NonVegMenu() ;
        Menu Kids = new KidsMenu() ;
        Rs.displayMenu(NonVegMenu);
        Rs.displayMenu(vegMenu);
        Rs.displayMenu(Kids);
        Rs.setOrder(order);
        Rs.setPaymentmethod(new CreditCard());
        Rs.generateFinalReceipt();
        
        
    
}
}
