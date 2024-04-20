package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] lis = new int[8];
		
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<lis.length;i++) {
			System.out.print("ingrese un numero en la pocicion ["+(i+1)+"]: ");
			while (!scanner.hasNextInt()) {
				System.out.print("ingrese un numero en la pocicion ["+(i+1)+"]: ");
	            scanner.next();
	        }
			lis[i] = scanner.nextInt();
		}

		for(int i=0;i<lis.length;i++) {
			System.out.println("Numero ingresado en la pocicion ["+(i+1)+"]: "+lis[i]);
		}
		
		scanner.close();
	}
}

