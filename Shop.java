

import java.util.ArrayList;
import java.util.List;
public class Shop {
	 private static Shop instance;
	    private List<Observer> customers = new ArrayList<>();

	    private Shop() {}

	    public static Shop getInstance() {
	        if (instance == null) {
	            instance = new Shop();
	        }
	        return instance;
	    }

	    public void addObserver(Observer customer) {
	        customers.add(customer);
	    }

	    public void notifyObservers(String message) {
	        for (Observer customer : customers) {
	            customer.update(message);
	        }
	    }

	    public void removeObserver(Observer customer) {
	        customers.remove(customer);
	    }

}
