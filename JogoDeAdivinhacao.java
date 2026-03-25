package Condicional;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
	
	public static void main(String[] args) {
		
		int numAle, numDig;
		Scanner ler = new Scanner(System.in);
		Random ale = new Random();
		
		System.out.println("Estou pensando em um numero de 0 a 10, sera que voce consegue adivinahar");
		System.out.print("Digite um numero: ");
		numDig = ler.nextInt();
		
		ler.close();
		
		numAle = ale.nextInt(10);
		
		if(numDig == numAle) {
			System.out.println("Parebéns!! voce acertou");
		}
		else {
			System.out.println("Hum, parece que não foi dessa vez ;). Eu pensei em " + numAle);
			
			int dif = numDig - numAle;
			if(dif >= -2 && dif <= 2) {
				System.out.println("Ah! foi quase");
			}
		}
	}
}
