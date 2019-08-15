package sequencial_exe;

import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		//area quadrado
		double lado;
		Scanner entrada = new Scanner(System.in);
		lado =  entrada.nextDouble();
		double area = lado * lado;
		System.out.println("area do quadrado " + area);
	}
}
