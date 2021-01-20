package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculate implements ICalculate {

	private float totalItemsValue;
	private Double finalValue = 0.0;
	private Map<String, BigDecimal> toPay = new HashMap<String, BigDecimal>();
	List<Item> items;
	List<Email> emails;

	@Override
	public Map<String, BigDecimal> calculate(List<Item> items, List<Email> emails) {
		this.items = items;
		this.emails = emails;
		
		calculateTotalItems();
		dividByEmail();
	
		return toPay;

	}

	private void calculateTotalItems() {
		for (int i = 0; i < items.size(); i++) {
			totalItemsValue += (items.get(i).getQtd() * items.get(i).getPrice());
		}
	
	}

	private void dividByEmail() {
	    for (int i = 0; i < emails.size(); i++) {
	    	calculateCentavos(emails.get(i).getEmail(),  emails.size(), (i == (emails.size()-1)) );	
		}
	}
	

	
	private void calculateCentavos(String email, int size, boolean isLast) {
		BigDecimal total = new BigDecimal((totalItemsValue / size )).setScale(2, RoundingMode.HALF_EVEN);
		finalValue += total.doubleValue();
		
		if(isLast) {
			if(finalValue %size == 0) {
				toPay.put(email , total );
			}else {
				addOrsubtrac(( totalItemsValue >= 11 ),total, email);
			}
		}else {
			toPay.put(email , total );
		}
		

	}
	public void addOrsubtrac(boolean isAdd, BigDecimal total, String email) {
		BigDecimal centavos = new BigDecimal(0.01).setScale(2, RoundingMode.HALF_EVEN);

		if (isAdd) {
			toPay.put(email, total.subtract(centavos));
		} else {
			toPay.put(email, total.add(centavos));

		}
	}
}
