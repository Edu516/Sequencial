package sequencial_exe;

import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double real,a,b,c;
		int inteiro;
		
		System.out.println("Numero real:");
		real = entrada.nextDouble();
		
		System.out.println("Numero inteiro");
		inteiro = entrada.nextInt();
		int inteiro2 = entrada.nextInt();
		
		a = inteiro * 2 + (inteiro2/2);
		b = inteiro * 3 + real;
		c = Math.pow(real, 3);
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		System.out.println("C ="+c);
	}

}
