package src;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ICalculate {
	public  Map<String,BigDecimal>  calculate( List<Item> items,List<Email> emails);
}
