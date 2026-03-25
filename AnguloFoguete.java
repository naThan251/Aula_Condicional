package Condicional;

import java.util.Scanner;

public class AnguloFoguete {
	
	public static void main(String[] args) {
		
		int angulo;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Para prever a taxa de alcançe do foguete, me informe o anguo de lancamento do seu foguete: ");
		angulo = ler.nextInt();
		ler.close();
		
		if(angulo < 55) {
			System.out.println("Boa distancia a alcançar");
		}
		else if (angulo < 35) {
			System.out.println("Distancia máxima");
		}
		else {
			System.out.println("Baixa distancia");
		}
	}

}
