public class ExtraCheese extends Additions {
    public ExtraCheese(Item item){
        super(item) ;
    }
    @Override
    public String getDescription(){
        return item.getDescription() + " + Extra cheese " ;
    }
    public double getcost(){
        return item.getcost() + 2.5 ;
    }
    public double getdiscount(){
        return item.getdiscount() + 0.15 ;
    }

    
}
