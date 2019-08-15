package sequencial_exe;

import java.util.Scanner;
public class ex3 {
	public static void main( String[] args) {
		int num, num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite dois numero para soma:");
		num = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println(num+" + "+num2+" = "+ (num+num2));
		
	}
}
