package Condicional;

import java.util.Scanner;

public class ClassificacaoGeracao {
	public static void main(String[] args) {
		
		int idade = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua idade, e eu te direi sua geração");
		idade = ler.nextInt();
		
		ler.close();
		
		if(idade >= 1946 && idade <= 1964) {
			System.out.println("Baby boomer");
		}else if (idade >= 1965 && idade <= 1980) {
			System.out.println("Geração X");
		}else if (idade >= 1981 && idade <=1996) {
			System.out.println("Geração Millennials ou Y");
		}else if (idade >= 1997 && idade <= 2010) {
			System.out.println("Geração Z");
		}else {
			System.out.println("Geração Alpha");
		}
	}

}
