package pizza;

public class pizzaStore {
	public pizza orderPizza(String type) {
		simplePizzaFactory spf=new simplePizzaFactory();
		if(spf.pizzaCreate(type)==null) {
			System.out.println("No such pizza");
			return spf.pizzaCreate(type);
		}
		spf.pizzaCreate(type).prepare();
		spf.pizzaCreate(type).bake();
		spf.pizzaCreate(type).cut();
		spf.pizzaCreate(type).box();
		return spf.pizzaCreate(type);
		
		
	}

}
