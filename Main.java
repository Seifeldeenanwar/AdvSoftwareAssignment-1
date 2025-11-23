import java.util.Scanner;
public class Main {
    public static void GUI(){
        Scanner input = new Scanner(System.in) ;
        while(true){
        int orderChoice ;
        Order order ;
        Service Rs = new ResturantService() ;
        System.out.print("\nChoose order type \n1-Din-in \n2-Takeway \n3-Delivary \n-> ");
        orderChoice = input.nextInt() ;
        if(orderChoice == 1){
            order = new Din_In() ;
            order.addObserver(new Waiter());
        }
        else if(orderChoice == 2){
            order = new TakeAway() ;
        }
        else {
            order = new Delivary() ;
            order.addObserver(new Driver());
        }
        order.addObserver(new Kitchen());
        System.out.print("1-Display Vegeterian menu\n2-Display Non Vegeterian menu\n3-Display kids menu \n-> ");
        int choice1 = input.nextInt() ;
        Menu menu ;
        if(choice1 == 1){
            menu = new VegMenu() ;

        }
        else if(choice1 == 2){
             menu = new NonVegMenu() ;
        }
        else {
              menu = new KidsMenu() ;
        }
        int choice2 = 1 ;
        do{
        Rs.displayMenu(menu);
        System.out.print("Select items \n-> ");
        choice2 = input.nextInt();
        Item item ;
        if(choice2 == 1){
            item = menu.createItalianPizza() ;
        }
        else if(choice2 == 2){
            item = menu.creatEasternPizza() ;
        }
        else {
            item = menu.createBurger() ;
        }
        int addoption = 1 ;
        do{
        System.out.print("Do you want to add extras ?0/1 -> ") ;
        addoption = input.nextInt();
        System.out.print("Select\n1-Extra cheese \n2-Extra onion \n3-Extra Topping \n-> ");
        int extrachoice = input.nextInt() ;
        if(extrachoice == 1){
            item = new ExtraCheese((item)) ;
        }
        else if(extrachoice == 2){
            item = new ExtraOnion(item) ;
        }
        else {
            item = new ExtraTopping(item) ;
        }
        System.out.print("Do you want to add more? 0/1 -> ");
        addoption = input.nextInt() ;
        }while(addoption == 1) ;
        order.setItem(item);
        System.out.print("Do you want to add another item ? 0-end , other add more \n->") ;
        choice2 = input.nextInt() ;
        }while(choice2 != 0);
        Payment p ;
        System.out.println("\nSelect your approrate payment method \n1-Credit card \n2-Mobile wallet \n3-Cash \n-> ") ;
        int payemntchoice = input.nextInt() ;
        if(payemntchoice == 1){
        p = new CreditCard() ;
        }
        else if (payemntchoice == 2){
            p = new MobileWallet() ;
        }
        else {
            p = new CashPay() ;
        }
        Rs.setPaymentmethod(p);
        Rs.setOrder(order);
        Rs.generateFinalReceipt();
        break;
        }

    }
    public static void main(String args[]){
        GUI() ;
        
    
}
}
