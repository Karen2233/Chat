package pizza;

public class clamPizza extends pizza {
	public boolean prepare() {
		System.out.println("clamPizza prepared");
		return true;
	}
	public boolean box() {
		System.out.println("clamPizza boxed");
		return true;
	}
	public boolean bake() {
		System.out.println("clamPizza baked");
		return true;
	}
	public boolean cut() {
		System.out.println("clamPizza cuted");
		return true;
	}

}
