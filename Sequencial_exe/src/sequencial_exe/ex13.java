package sequencial_exe;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		double peso,regulamento = 50,valor = 4,multa=0,excesso;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o peso total da pesca R$: ");
		peso = entrada.nextDouble();
		
		if(regulamento < peso ) {
			excesso = peso - regulamento;
			multa = valor * excesso;
			System.out.println("Valor da multa R$: "+ multa);
			System.out.println("Peso excedente Kg: ");
		}else {
			System.out.println("Esta dentro do regulamento ");
			System.out.println("Total de multa a pagar: "+multa);
		}
			
		

	}

}
