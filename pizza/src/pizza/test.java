package pizza;
import java.util.*;

public class test {
	public static void main(String args[]) {
		System.out.println("Enter type of pizza");
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		pizzaStore pS=new pizzaStore();
		pS.orderPizza(a);
	}

}
