package model;
public class Product {
	private int id;
	private String name;
	private boolean active;
	private String description;
	private int price;
	private int stock;
	private String categoria;

	public Product(int id, String name, boolean active, String description, int price, int stock, String categoria) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.categoria = categoria;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return getId()+""+getName()+" "+getStock()+" "+getActive();
	}
}