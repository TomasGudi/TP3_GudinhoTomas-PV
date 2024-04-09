package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean flag;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("ingrese un numero: ");
			 if(scanner.hasNextInt()) {
				 num = scanner.nextInt();
				 flag = true;
			 }
			 else {
				 scanner.next();
				 flag = false;
			 } 
		}while(!flag);
		
		scanner.close();
		
		if(num % 2 != 1) {
			System.out.println("Su triple es: " + num * 3);
		}
		else {
			System.out.println("Su doble es: " + num * 2);
		}	
	}
}
