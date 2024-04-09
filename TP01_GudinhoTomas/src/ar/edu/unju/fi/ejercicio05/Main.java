package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean flag = false;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un numero:");
			if(scanner.hasNextInt()) {
				num = scanner.nextInt();
				flag = true;
				for(int i = 0; i <= 10; i++) {
					System.out.println(num + " x " + i + " = " + (num * i));
				}
			}else {
				scanner.next();
			}
		}while(!flag);
		
		scanner.close();
	}
}
