package Condicional;

import java.util.Scanner;

public class PontuacaoForca {
	public static void main(String[] args) {
		
		int poder = 0;
		String nome = "";
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome de personagem e seu poder, de 1 a 100");
		
		System.out.print("Informe o nome: ");
		nome = ler.next();
		
		System.out.print("Informe o poder: ");
		poder = ler.nextInt();
		
		ler.close();
		
		if(poder >= 81) {
			System.out.println(nome + ", poder Lendário");
		}else if (poder >= 51) {
			System.out.println(nome + ", poder Elite");
		}else if (poder >= 21) {
			System.out.println(nome + ", poder Guerreiro");
		}else {
			System.out.println(nome + ", poder Iniciante");
		}
	}

}
