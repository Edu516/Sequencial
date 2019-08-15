package sequencial_exe;

import java.util.Scanner;

public class ex12 {
	public static void main (String[]args) {
		double Hpeso,Mpeso,altura;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Informe sua altura: ");
		altura= entrada.nextDouble();
		
		Hpeso=(72.7*altura)-58;
		Mpeso=(62.1*altura)-44.7;
		System.out.println("Peso ideal pra mulherers:"+Mpeso);
		System.out.println("Peso ideal para Homens: "+Hpeso);
		
		
		
	}
}
