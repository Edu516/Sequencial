package sequencial_exe;

import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n1,n2,n3,n4,media;
		System.out.println("Digite as 4 notas do aluno uma por vez");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();
		
		media= (n1+n2+n3+n4)/4;
		
		System.out.println("Media do aluno:" + media);
		
	}
}
