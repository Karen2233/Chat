package pizza;

public class cheesePizza extends pizza{
	public boolean prepare() {
		System.out.println("cheesePizza prepared");
		return true;
	}
	public boolean box() {
		System.out.println("cheesePizza boxed");
		return true;
	}
	public boolean bake() {
		System.out.println("cheesePizza baked");
		return true;
	}
	public boolean cut() {
		System.out.println("cheesePizza cuted");
		return true;
	}
}
