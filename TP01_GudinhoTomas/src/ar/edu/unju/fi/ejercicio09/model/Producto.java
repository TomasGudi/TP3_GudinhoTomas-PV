package ar.edu.unju.fi.ejercicio09.model;

public class Producto {
		private String Nombre;
		private int codigo;
		private double precio;
		private int descuento;
		
		public Producto() {
		}
		
		
		
		@Override
		public String toString() {
			return "Producto [Nombre=" + Nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
		}

		public double calcularDescuento() {
			double aux;
			aux = (this.descuento * this.precio)/100;
			return this.precio - aux;
		}
		
		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getDescuento() {
			return descuento;
		}

		public void setDescuento(int descuento) {
			this.descuento = descuento;
		}
		
		
}
