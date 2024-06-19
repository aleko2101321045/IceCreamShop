
public class IceCreamFactory {
    public static IceCream createIceCream(String type) {
        switch (type.toLowerCase()) {
            case "vanilla":
                return new VanillaIceCream();
            case "chocolate":
                return new ChocolateIceCream();
            case "strawberry":
                return new StrawberryIceCream();
            default:
                throw new IllegalArgumentException("Unknown ice cream type: " + type);
        }
    }
}