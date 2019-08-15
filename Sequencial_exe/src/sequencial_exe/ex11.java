package sequencial_exe;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double altura, peso;
		
		System.out.println("Informe a sua altura :");
		altura = entrada.nextDouble();
		
		peso=(72.7* altura)-58;
		
		System.out.println("Peso ideal:"+ peso);
		
	}
}
