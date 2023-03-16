package controller;
import model.Pedido;
import model.Product;
public class pedidoController {
	private Pedido pedido;
	public pedidoController(Pedido pedido) {
		this.pedido = pedido;
	}

	public boolean agregarProducto(Product product) {
		if(product!=null){
			this.pedido.addProduct(product);
			return true;
		}else{
			return false;
		}
	}

	public boolean eliminarProducto(Product product) {
		for(Product product1:this.pedido.getProductos()){
			if(product==product1){
				pedido.removeProduct(product);
				return true;
			}
		}
		return false;
	}

	public boolean compra() {
		int newStock;
		for (Product product: pedido.getProductos()){
			newStock=product.getStock()-1;
			product.setPrice(newStock);
		}
		System.out.println("Se ha realizado la compra");
		return true;
	}
}