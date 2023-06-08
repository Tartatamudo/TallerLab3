package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	Scanner teclado = new Scanner(System.in);
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public Pedido() {
	}

	public void AgregarProducto() {

		System.out.println("Escriba nombre producto");
		String nombre = teclado.nextLine();
		System.out.println("Escriba el precio del producto");
		Double valor = teclado.nextDouble();
		Producto producto = new Producto(nombre, valor);

		productos.add(producto);
	}

	public void EliminarProducto() {
		System.out.println("Eliga el nombre del producto a eliminar");
		String nombre = teclado.nextLine();

		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getNombre() == nombre){
				productos.remove(i);
			}
		}

	}

}