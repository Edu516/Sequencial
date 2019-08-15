package sequencial_exe;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		double Q_hora,salario,inss,sindicato,ir,l_salario;
		int horas;
		
		double IR = 0.11,INSS = 0.08,SINDICATO =0.05;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas horas trabalhadas(Somente horas inteiras):");
		Q_hora = entrada.nextDouble();
		
		System.out.print("\nValor da hora :");
		double valor = entrada.nextDouble();
		
		salario = Q_hora *valor;
		
		inss = INSS * salario;
		sindicato = SINDICATO * salario;
		ir = IR * salario;
		
		l_salario = salario - inss - sindicato - ir;
		
		System.out.println("Salario Bruto :R$"+ salario
				+ "\nINSS R$"+inss
				+ "\nSindicato R$"+sindicato
				+ "\nSalario L�quido R$"+l_salario);
		

	}

}
