package Condicional;

import java.util.Scanner;

public class Ternario2 {
	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor, que eu irei conferir se é multiplo de 5: ");
		a = ler.nextDouble();
		
		ler.close();
		
		System.out.print( "O numero " + a);
		System.out.println(a % 5 == 0 ? "é mulitplo de 5" : "não é multiplo");
	}

}
