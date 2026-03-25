package Condicional;

import java.util.Scanner;

public class PressaoFoguete {
	
	public static void main(String[] args) {
		
		int pressao;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Classificador de risco de explosão do foguete. Informe a pressão em PSI: ");
		pressao = ler.nextInt();
		ler.close();
		
		if(pressao >= 110) {
			System.out.println("Risco de explosão");
		}
		else if (pressao >= 90) {
			System.out.println("Alta pressão");
		}
		else if (pressao >= 60) {
			System.out.println("Pressão Ideal");
		}
		else {
			System.out.println("Pressão baixa");
		}
	}

}
