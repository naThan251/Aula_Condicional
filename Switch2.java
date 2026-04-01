package Condicional;

import java.util.Scanner;

public class Switch2 {
	
	public static void main(String[] args) {
		
		int mes;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Me diga um mes do ano, e eu direi a estação do ano");

		System.out.print("Mes: ");
		mes = ler.nextInt();
		
		ler.close();
		
		switch (mes) {
		case 1: {
			System.out.println("Janeiro, é Verão!");
			break;
		}
		case 2: {
			System.out.println("Fevereiro, é Verão!");
			break;
		}
		case 3: {
			System.out.println("Março, é Outono!");
			break;
		}
		case 4: {
			System.out.println("Abril, é Outono!");
			break;
		}
		case 5: {
			System.out.println("Maio, é Outono!");
			break;
		}
		case 6: {
			System.out.println("Junho, é Inverno!");
			break;
		}
		case 7: {
			System.out.println("Julho, é Inverno!");
			break;
		}
		case 8: {
			System.out.println("Agosto, é Inverno!");
			break;
		}
		case 9: {
			System.out.println("Setembro, é Primavera!");
			break;
		}
		case 10: {
			System.out.println("Outubro, é Primavera!");
			break;
		}
		case 11: {
			System.out.println("Novembro, é Primavera!");
			break;
		}
		case 12: {
			System.out.println("Dezembro, é Verão!");
			break;
		}
		default:
			System.out.println("Mes invalido!! Tente novamente");
		}
		
	}

}
