public class NonVegMenu implements Menu {
    @Override
    public ItalianPizza createItalianPizza(){
        return new NonVegItalianPizza() ;
    }
    @Override
    public EasternPizza creatEasternPizza(){
        return new NonVegEasternPizza() ;
    }
    @Override 
    public ClassicBurger createBurger(){
        return new NonVegClassicBurger() ;
    }

    
}
