public interface Service {
    public void displayMenu(Menu menu);
    public void setOrder(Order order);
    public double getTotalCost();
    public double getDiscount();
    public void setPaymentmethod(Payment p);
    public void generateFinalReceipt();
    
}
