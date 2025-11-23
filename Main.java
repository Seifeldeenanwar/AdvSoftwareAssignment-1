public class Main {
    public static void main(String args[]){
        Item extracheeseItalianpizza = new ExtraCheese(new NonVegItalianPizza()) ;
        Item ExtraOnionVegClassicBurger = new ExtraOnion(new VegItalianPizza()) ;
        Item extracheeseclassickidsburger = new ExtraCheese(new KidClassicBurger()) ;
        Item nonvegItalianPizzaWithExtraToppingAndExtraCheese = new ExtraCheese(new ExtraTopping(new NonVegItalianPizza())) ;
        Menu vegMenu = new VegMenu() ;
        Menu NonVegMenu = new NonVegMenu() ;
        Menu Kids = new KidsMenu() ;
        Order order = new Din_In() ;
        ResturantService Rs = new ResturantService() ;
        Observer waiter = new Waiter();
        Observer kitchen = new Kitchen() ;
        order.addObserver(kitchen);
        order.addObserver(waiter) ;
        Rs.displayMenu(NonVegMenu);
        Rs.displayMenu(vegMenu);
        Rs.displayMenu(Kids);
        order.setItem(ExtraOnionVegClassicBurger);
        order.setItem(extracheeseItalianpizza);
        order.setItem(extracheeseclassickidsburger);
        order.setItem(nonvegItalianPizzaWithExtraToppingAndExtraCheese);
        Rs.setOrder(order);
        Rs.setPaymentmethod(new CreditCard());
        Rs.generateFinalReceipt();
        
        
    
}
}
