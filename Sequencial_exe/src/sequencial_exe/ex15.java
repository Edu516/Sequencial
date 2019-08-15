package sequencial_exe;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		int lata_l= 18,latas;
		
		double area, rende_lata = 3,valor_lata= 80;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a area em metros");
		area = entrada.nextDouble();
		
		double total=  (area /(lata_l* rende_lata));
		
		if(  total % 2 > 0) {	
			total = (int)total +1; 
		}
		double pagar = valor_lata * total;
		System.out.println("Latas :"+ total );
		System.out.println("Valor :R$"+ pagar);
	}

}
