package Condicional;

import java.util.Random;
import java.util.Scanner;

public class CobrancaPenalti {
	public static void main(String[] args) {
		
		int canto = 0;
		int cantoG = 0;
		Scanner ler = new Scanner(System.in);
		Random ale = new Random();
		
		System.out.println("Jogo de cobrança de penalti. Escolha um canto para jogar (1 para esquerda, 2 para meio, 3 para direita), e o goleiro escolhera outro para defender, aleatoriamente. Sera que voce vai conseguir?");
		
		System.out.print("Digite o canto esclhido: ");
		canto = ler.nextInt();
		
		ler.close();
		
		cantoG = ale.nextInt(2)+1;
		
		System.out.println(canto != cantoG? "Parabens! Voce consegui. O goleiro defendeu " + cantoG :"A. Não foi dessa vez");
	}

}
