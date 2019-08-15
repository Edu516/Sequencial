package sequencial_exe;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		 double pi = 3.14;
		
		double area, raio;
		
		Scanner entrada =new Scanner(System.in);
		raio = entrada.nextDouble();
		
		System.out.println("Area do circulo "+ (raio*2*pi));
	}
}
