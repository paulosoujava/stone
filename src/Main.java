package src;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>( );
	    List<Email> emails = new ArrayList<Email>();
	    Calculate calculate = new Calculate();
	    
//	    emails.add(new Email("user_1@gmail.com"));
//	    emails.add(new Email("user_2@gmail.com"));
//	    emails.add(new Email("user_3@gmail.com"));
	    items.add(new Item(1, 1.00, "Hamburger"));
	    
	    Map<String, BigDecimal> resultado = calculate.calculate(items, emails);
	    System.out.println(resultado);

	}

}
