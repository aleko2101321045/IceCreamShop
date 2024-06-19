import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Създаване на магазина и клиентите
        Shop shop = Shop.getInstance();
        Customer customer1 = new Customer("Иван");
        Customer customer2 = new Customer("Мария");

        shop.addObserver(customer1);
        shop.addObserver(customer2);

        // Изпращане на съобщение до клиентите
        shop.notifyObservers("Имаме нова промоция!");

        // Създаване на сладолед с различни декоратори
        IceCream vanillaIceCream = IceCreamFactory.createIceCream("vanilla");
        IceCream chocolateSprinkles = new ChocolateSprinklesDecorator(vanillaIceCream);
        IceCream chocolateSauce = new ChocolateSauceDecorator(vanillaIceCream);

        System.out.println(chocolateSprinkles.getDescription() + ": " + chocolateSprinkles.cost() + " лв.");
        System.out.println(chocolateSauce.getDescription() + ": " + chocolateSauce.cost() + " лв.");

        // Използване на различни стратегии за консумация
        ConsumptionStrategy atHome = new AtHomeStrategy();
        ConsumptionStrategy atThePark = new AtTheParkStrategy();
        ConsumptionStrategy atTheBeach = new AtTheBeachStrategy();

        // Демонстрация на стратегии
        atHome.consume();
        atThePark.consume();
        atTheBeach.consume();
    }
}
	
