public class KidsMenu implements Menu {
    @Override
    public ItalianPizza createItalianPizza(){
        return new KidsItalianPizza() ;
    }
    @Override
    public EasternPizza creatEasternPizza(){
        return new KidEasternPizza() ;
    }
    @Override 
    public ClassicBurger createBurger(){
        return new KidClassicBurger() ;
    }

    
}
