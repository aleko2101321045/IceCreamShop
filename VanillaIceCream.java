public class VanillaIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Ванилов сладолед";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
