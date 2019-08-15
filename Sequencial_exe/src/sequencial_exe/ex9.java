package sequencial_exe;

import java.util.Scanner;

public class ex9 {
	public static void main(String[]args) {
		double C, f;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tempreatura em farehint");
		f = entrada.nextDouble();
		System.out.println("Conver��o para celsius:"+ (C =(f-32)/1.8));
	}
}
