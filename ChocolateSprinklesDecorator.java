
public class ChocolateSprinklesDecorator implements IceCream {
    private IceCream iceCream;

    public ChocolateSprinklesDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", с шоколадови пръчици";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 0.30;
    }
}