package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public Vendedor(String nombre) {
		this.nombre = nombre;
	}

	public void AgregarPedido() {
		Pedido pedido = new Pedido();
		int num = 1;
		while(num == 1){
			System.out.println("Si quiere agregar un objeto oprima 1");
			num = teclado.nextInt();
			if (num == 1){
				pedido.AgregarProducto();
			}
		}
		pedidos.add(pedido);
	}

	public void DespacharPedido() {
		System.out.println("Su pedido fue despachado");
	}

	public void AgregarProducto() {
		System.out.println("Escriba nombre producto");
		String nombre = teclado.nextLine();
		System.out.println("Escriba el precio del producto");
		Double valor = teclado.nextDouble();
		Producto producto = new Producto(nombre, valor);

		productos.add(producto);
	}

	public void VenderProductos() {
		Double suma = 0.0;

		for (int i = 0; i <productos.size(); i++) {
			suma = suma + productos.get(i).getPrecio();
		}
		System.out.println("El precio es de: " + suma);
	}

}