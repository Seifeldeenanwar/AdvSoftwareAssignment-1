import java.util.ArrayList;
import java.util.List;

public class ResturantService implements Service {
    public Order order ;
    public Payment payment ;
    public EasternPizza Ep ;
    public ItalianPizza Ip ;
    public ClassicBurger Cp ; 
    @Override
    public void displayMenu(Menu menu){
        Ep = menu.creatEasternPizza() ;
        Ip = menu.createItalianPizza() ;
        Cp = menu.createBurger() ;
        System.out.println(menu.getCategoryName() + ": ");
        System.out.println();
        System.out.println("1- "+Ep.getDescription()) ;
        System.out.println("2- "+ Ip.getDescription());
        System.out.println("3- "+Cp.getDescription());
        System.out.println();
    }
    @Override
    public void setOrder(Order order) {
        this.order = order ;
    }
    public double getTotalCost(){
        double totalCost = 0 ;
        List<Item> ls = new ArrayList<>();
        ls = order.getListOrder() ;
        for(Item i : ls){
            totalCost += i.getcost() ;
        }
        return totalCost ;
    }
    @Override
    public double getDiscount(){
        double totaldiscount = 0 ;
        List<Item> ls = new ArrayList<>();
        ls = order.getListOrder() ;
        for(Item i : ls){
            totaldiscount += i.getdiscount() ;
        }
        return totaldiscount ;
    }
    @Override
    public void setPaymentmethod(Payment p){
        this.payment = p ;
    }
    @Override
    public void generateFinalReceipt(){
        List<Item> ls = new ArrayList<>();
        ls = order.getListOrder() ;
        System.out.println("\nReceipt info :");
        for(Item i : ls){
            System.out.println(i.getDescription() + " " + i.getcost());
        }
        double totalCost = getTotalCost() ;
        double totaldiscount = getDiscount() ;
        System.out.print("payment method is ");
        payment.pay() ;
        System.out.println("Total discount = "+totaldiscount);
        System.out.print("Taxes = ");
        System.out.println(order.getTax());
        System.out.println("Total cost After discount and add taxe = " + (totalCost - totaldiscount + order.getTax()));
    }
    
}
