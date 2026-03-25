package Condicional;

import java.util.Scanner;

public class ClassificacaoCompeticao {
	
	public static void main(String[] args) {
		
		int distancia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Me informe a distância que voce alcançou, e eu vou te classificar:");
		distancia = ler.nextInt();
		
		ler.close();
		
		if(distancia >= 150) {
			System.out.println("Parabéns! Medalha de Ouro");
		}
		else if(distancia <= 149 && distancia >= 100) {
			System.out.println("Parabéns! Medalha de Prata");
		}
		else if (distancia <= 99 && distancia >= 50) {
			System.out.println("Medalha de Bronze");
		}
		else {
			System.out.println("Sem medalhas");
		}
	}

}
