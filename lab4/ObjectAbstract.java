package lab3;

public abstract class ObjectAbstract implements ObjectInterface {
    protected String name;
    protected int Amount;

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getAmount(){
        return this.Amount;
    }

}
