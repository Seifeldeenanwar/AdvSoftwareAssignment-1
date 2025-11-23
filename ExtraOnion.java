public class ExtraOnion extends Additions {
    public ExtraOnion(Item item){
        super(item) ;
    }
    @Override
    public String getDescription(){
        return item.getDescription() + " + Extra Onion " ;
    }
    public double getcost(){
        return item.getcost() + 1 ;
    }

    
}
