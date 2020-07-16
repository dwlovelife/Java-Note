package structure.decorator;

/**
 *  奶泡
 */
public class Whip extends Condiment {

    public Whip(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "【奶泡】";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.7;
    }
}
