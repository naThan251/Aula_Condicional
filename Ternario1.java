package Condicional;

import java.util.Scanner;

public class Ternario1 {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a Primeira nota: ");
		nota1 = ler.nextDouble();

		System.out.println("Informe a Segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe a Terceira nota: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe a Quarta nota: ");
		nota4 = ler.nextDouble();
		
		ler.close();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println(media >6? "Aprovado" + media : "Reprovado" + media);
	}

}
