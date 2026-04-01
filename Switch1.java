package Condicional;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		double num1, num2, result;
		int select;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cauculadora. Escolha uma operação para prosseguir: ");
		System.out.print("(1- Soma, 2- Subtração, 3- Multiplicação, 4- Divisão) Digite: ");
		select = ler.nextInt();
		
		System.out.print("Digite o primeiro numero: ");
		num1 = ler.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		num2 = ler.nextDouble();
		
		ler.close();

		switch (select) {
		case 1: {
			result = num1 + num2;
			System.out.println("O resultado é " + result);
			break;
		}
		case 2: {
			result = num1 - num2;
			System.out.println("O resultado é " + result);
			break;
		}
		case 3: {
			result = num1 * num2;
			System.out.println("O resultado é " + result);
			break;
		}
		case 4: {
			result = num1 / num2;
			System.out.println("O resultado é " + result);
			break;
		}
		default:
			System.out.println("O numero digitado é inválido, Tente novamente!!");
		}
	}

}
