package Condicional;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		n1 = ler.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.print("Informe o terceiro nota: ");
		n3 = ler.nextDouble();
		
		System.out.print("Informe o quarto nota: ");
		n4 = ler.nextDouble();
		
		ler.close();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media >= 6) {
			System.out.println("Aprovado com "+ media);
		}
		else {
			System.out.println("Reprovado com "+ media);
		}
	}
}
