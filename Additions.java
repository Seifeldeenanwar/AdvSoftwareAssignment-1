public abstract class Additions extends Item {
    public Item item ;
    public Additions(Item item){
        this.item = item ;
    }
    public String getDescription(){
        return item.getDescription() ;
    }
    public double getcost(){
        return item.getcost() ;
    }
    public double getdiscount(){
        return item.getdiscount() ;
    }
}
