package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio09.model.Producto;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int descuento, aux=0;
		double precio;
		String nombre, codigo;
		
		while(aux < 3) {
			Producto producto = new Producto();
			System.out.print("\nIngrese Nombre: ");
        	nombre = scanner.nextLine();
        	producto.setNombre(nombre);
        	System.out.print("\nIngrese codigo: ");
        	codigo = scanner.nextLine();
        	producto.setCodigo(codigo);
        	System.out.print("\nIngrese precio: ");
        	precio = scanner.nextDouble();
        	producto.setPrecio(precio);
        	System.out.print("\nIngrese descuento entre 0 y 50: ");
        	descuento = scanner.nextInt();
        	while(descuento<0 || descuento>51) {
        		System.out.print("\nIngrese descuento entre 0 y 50: ");
        		descuento = scanner.nextInt();
				}
        	scanner.nextLine();
        	producto.setDescuento(descuento);
        
        	System.out.println(producto);
        	System.out.println("Precio con decuento=" + producto.calcularDescuento());
        	aux++;
		}
    	scanner.close();
	}
}
