package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0,aux = 1,fac = 1;
		boolean flag = false;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("ingrese un numero entre 0 y 10: ");
			 if(scanner.hasNextInt()) {
				 num = scanner.nextInt();
				 if(num >= 0 && num < 11) {
					 flag = true;
			 	}
			 }
			 else {
				 scanner.next();
			 } 
		}while(!flag);
		
		scanner.close();
		 
		if(num != 0 && num != 1) {
			while (aux <= num) {
				fac = fac*aux; 
				aux = aux+1;
			}
		}
		System.out.println("Su factorial es: " + fac);
	}
}
