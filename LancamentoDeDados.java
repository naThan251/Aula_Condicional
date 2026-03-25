package Condicional;

import java.util.Random;

public class LancamentoDeDados {
	
	public static void main(String[] args) {
		
		int numero;
		Random aleatorio = new Random();
		
		numero = aleatorio.nextInt(6)+1;
		
		System.out.println("Numero " + numero);
	}

}
