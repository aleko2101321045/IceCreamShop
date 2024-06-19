
public class ChocolateIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Шоколадов сладолед";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}