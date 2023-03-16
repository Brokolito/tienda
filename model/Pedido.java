package model;
import java.util.ArrayList;
import model.Product;

public class Pedido {
	private int id;
	private Client client;
	private ArrayList<Product>productos;

	public Pedido(int id,Client client) {
		this.id = id;
		this.productos=new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}

	public ArrayList<Product> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Product> productos) {
		this.productos = productos;
	}
	public void removeProduct (Product product){
		productos.remove(product);
	}
	public void addProduct (Product product){
		productos.add(product);
	}
}