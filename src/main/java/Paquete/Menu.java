package Paquete;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        Producto producto = new Producto("Arroz", 1990.90);
        int num = 1;
        while(num > 0 && num < 3){

            System.out.println("[1]Imprimir toString");
            System.out.println("[2]Editar datos");
            System.out.println("[3]Salir");
            num = teclado.nextInt();
            switch (num){
                case 1:
                    System.out.println(producto.toString());
                    break;
                case 2:
                    EditarDatos(producto);
                case 3:
                    break;
            }
        }
    }
    public static void EditarDatos(Producto producto){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eliga el nuevo nombre del producto ");
        String nombre = teclado.nextLine();

        System.out.println("Eliga el nuevo precio del producto");
        Double precio  = teclado.nextDouble();

        producto.setNombre(nombre);
        producto.setPrecio(precio);
    }

    public static void main(String[] args) {
        menu();
    }
}
