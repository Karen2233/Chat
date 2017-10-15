package pizza;

public class simplePizzaFactory {
	public simplePizzaFactory() {
		
	}
	public pizza pizzaCreate(String type) {
		if(type.equals("clamPizza")) {
			clamPizza cP=new clamPizza();
			return cP;
		}
		else if(type.equals("peperoniPizza")) {
			peperoniPizza pP=new peperoniPizza();
			return pP;
		}
		else if(type.equals("cheesePizza")) {
			cheesePizza c=new cheesePizza();
			return c;
		}
		else {
			return null;
		}
	}

}
