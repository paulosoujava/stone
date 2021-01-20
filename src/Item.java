package src;


public class Item {
	
	private int qtd;
	private double price;
	private String item;
	
	public Item(int qtd, double price, String item) {
		super();
		this.qtd = qtd;
		this.price = price;
		this.item = item;
	}
	
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	

}
