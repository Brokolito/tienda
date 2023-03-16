package controller;
import model.Product;
import java.util.ArrayList;


public class productController {
	private ArrayList<Product> productos;

	public void mostrarProductos() {
		for(Product product1:this.productos){
			System.out.println(product1);
		}
	}

	public Product buscarProducto(String name) {
		for (Product product1: this.productos){
			if (product1.getName()==name){
				return product1;
			}
		}
		return null;
	}
	public ArrayList<Product> buscarCategoria(String categoria) {
		ArrayList<Product> productosCategoria = new ArrayList<Product>();
		for(Product product : this.productos){
			if(product.getCategoria()==categoria){
				productosCategoria.add(product);
			}
		}
		return productosCategoria;
	}

	public boolean agregarProducto(Product producto) {
		if(producto!=null){
			productos.add(producto);
			return true;
		}else{
			return false;
		}
	}

	public boolean editarProducto(Product product, String attribute,String metodo) {
		for (Product product1: this.productos){
			if(product1.equals(product)){
				switch (metodo){
					case "nombre":
						product1.setName(attribute);
						break;
					case "descripcion":
						product1.setDescription(attribute);
						break;
					case "categoria":
						product1.setCategoria(attribute);
						break;
					case "active":
						if(attribute=="activo"){
							product1.setActive(true);
						} else if (attribute=="inactivo") {
							product1.setActive(false);
						}
						break;
					case "stock":
						int newStock=Integer.parseInt(attribute);
						product1.setStock(newStock);
						break;
					case "precio":
						int newPrice=Integer.parseInt(attribute);
						product1.setPrice(newPrice);
						break;
					default:
						return false;
				}
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	public boolean eliminarProducto(Product product) {
		for (Product product1:this.productos){
			if(product1.equals(product)){
				productos.remove(product);
				return true;
			}
		}
		return false;
	}
}