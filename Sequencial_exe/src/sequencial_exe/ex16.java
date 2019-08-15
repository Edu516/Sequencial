package sequencial_exe;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		int latas;
		
		double galao_l=3.6,lata_l= 18,area, rende_lata = 6,rende_galao =6,valor_lata= 80,valor_galao =25;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a area em metros");
		area = entrada.nextDouble();
		
		double total=  (area /(lata_l* rende_lata));
		double total_g=  (area /(galao_l* rende_galao));
		
		if(  total % 2 > 0) {	
			total = (int)total +1; 
		}
		if(  total_g % 2 > 0) {	
			total_g = (int)total_g +1; 
		}
		double pagar = valor_lata * total;
		double pagar_g = valor_galao * total_g;
		System.out.println("Latas :"+ total );
		System.out.println("Valor :R$"+ pagar);
                System.out.println("Galão :"+ total_g);
		System.out.println("Valor :R$"+ pagar_g);
	}

}
