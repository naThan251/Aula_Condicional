package Condicional;

import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		
		int dia = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero de 1 á 7: ");
		dia = ler.nextInt();
		ler.close();
		
		if(dia == 1) {
			System.out.println("Domingo");
		}
		else if(dia == 2) {
			System.out.println("Segunda");
		}
		else if(dia == 3) {
			System.out.println("Terça");
		}
		else if(dia == 4) {
			System.out.println("Quarta");
		}
		else if(dia == 5) {
			System.out.println("Qunta");
		}
		else if(dia == 6) {
			System.out.println("Sexta");
		}
		else if(dia == 7) {
			System.out.println("Sábado");
		}
		else {
			System.out.println("Dia Inválido!!");
		}
	}

}
