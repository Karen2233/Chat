package pizza;

public class peperoniPizza extends pizza {
	public boolean prepare() {
		System.out.println("peperoniPizza prepared");
		return true;
	}
	public boolean box() {
		System.out.println("peperoniPizza boxed");
		return true;
	}
	public boolean bake() {
		System.out.println("peperoniPizza baked");
		return true;
	}
	public boolean cut() {
		System.out.println("peperoniPizza cuted");
		return true;
	}
}
