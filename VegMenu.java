public class VegMenu implements Menu {
    @Override
    public ItalianPizza createItalianPizza(){
        return new VegItalianPizza() ;
    }
    @Override
    public EasternPizza creatEasternPizza(){
        return new VegEasternPizza() ;
    }
    @Override 
    public ClassicBurger createBurger(){
        return new VegClassicBurger() ;
    }

    
}
