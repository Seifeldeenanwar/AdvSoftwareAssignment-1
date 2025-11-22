import java.util.ArrayList;
import java.util.List;

public class ResturantService {
    public Order order ;
    public Payment payment ;
    public EasternPizza Ep ;
    public ItalianPizza Ip ;
    public ClassicBurger Cp ; 
    public void displayMenu(Menu menu){
        Ep = menu.creatEasternPizza() ;
        Ip = menu.createItalianPizza() ;
        Cp = menu.createBurger() ;
        Ep.getDescription() ;
        Ip.getDescription() ;
        Cp.getDescription();
    }
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
    public double getDiscount(){
        double totaldiscount = 0 ;
        List<Item> ls = new ArrayList<>();
        ls = order.getListOrder() ;
        for(Item i : ls){
            totaldiscount += i.getdiscount() ;
        }
        return totaldiscount ;
    }
    public void setPaymentmethod(Payment p){
        this.payment = p ;
    }
    public void generateFinalReceipt(){
        List<Item> ls = new ArrayList<>();
        ls = order.getListOrder() ;
        for(Item i : ls){
            System.out.println(i.getDescription() + " cost = " + i.getcost());
        }
        double totalCost = getTotalCost() ;
        double totaldiscount = getDiscount() ;
        System.out.print("payment method is ");
        payment.pay() ;
        System.out.println();
        System.out.print("Taxes = ");
        order.getTax() ;
        System.out.println();
        System.out.println("Total cost After discount = " + (totalCost - totaldiscount));
    }
    
}
