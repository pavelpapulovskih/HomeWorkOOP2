public class Human extends Actor{
    
    public Human(String name){
        super(name);
    }
    public String getName(){
        return super.name;
    }
    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = makeOrder;
    }
    public void setTakeOrder(boolean takeOrder){
        super.isTakeOrder = takeOrder;
    }
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }
}
