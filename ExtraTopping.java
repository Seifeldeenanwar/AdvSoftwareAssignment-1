public class ExtraTopping extends Additions {
    public ExtraTopping(Item item){
        super(item) ;
    }
    @Override
    public String getDescription(){
        return item.getDescription() + " + Extra Topping " ;
    }
    public double getcost(){
        return item.getcost() + 3 ;
    }
    
}
