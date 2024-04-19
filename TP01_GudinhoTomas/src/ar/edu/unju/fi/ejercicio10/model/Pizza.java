package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	    private int diametro;
	    private int precio;
	    private double area;
	    private boolean ingreEspeciales;

	    private static final int ESPECIAL20 = 500;
	    private static final int ESPECIAL30 = 750;
	    private static final int ESPECIAL40 = 1000;

	    public Pizza() {
	    }
	    
	    public void calcularArea() {
	        double radio = diametro/2.0;
	        area = Math.PI * Math.pow(radio,2);
	    }
	    
	    public void calcularPrecio() {
	        switch (diametro) {
	            case 20:
	            	if (ingreEspeciales) {
	            		precio = 4500 + ESPECIAL20;
	            	}
	            	else {
	            		precio = 4500;
	            	}
	                break;
	            case 30:
	            	if (ingreEspeciales) {
	            		precio = 4800 + ESPECIAL30;
	            	}
	            	else {
	            		precio = 4800;
	            	}
	                break;
	            case 40:
	            	if (ingreEspeciales) {
	            		precio = 5500 + ESPECIAL40;
	            	}
	            	else {
	            		precio = 5500;
	            	}
	                break;
	        }
	    }
	    
	    public int getDiametro() {
	        return diametro;
	    }

	    public void setDiametro(int diametro) {
	        this.diametro = diametro;
	    }

	    public int getPrecio() {
	        return precio;
	    }

	    public double getArea() {
	        return area;
	    }

	    public boolean getIngreEspeciales() {
	        return ingreEspeciales;
	    }

	    public void setIngreEspeciales(boolean ingreEspeciales) {
	        this.ingreEspeciales = ingreEspeciales;
	    }

}
