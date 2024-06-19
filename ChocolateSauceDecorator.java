
public class ChocolateSauceDecorator implements IceCream {
    private IceCream iceCream;

    public ChocolateSauceDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", с шоколадова глазура";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.50;
    }
}
