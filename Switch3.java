package Condicional;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		 
		int dia, mes;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua data de nascimento");
		System.out.print("Dia:");
		dia = ler.nextInt();
		System.out.print("Mes: ");
		mes = ler.nextInt();
		
		ler.close();
		
		switch (mes) {
		case 1: {
			if(dia <=19)
			{
				System.out.println("Capricornio");
			}else if(dia >= 20)
			{
				System.out.println("Aquario");
			}
			break;
		}
		case 2: {
			if(dia <=18)
			{
				System.out.println("Aquario");
			}else if(dia >= 19)
			{
				System.out.println("Peixe");
			}
			break;
		}
		case 3: {
			if(dia <=20)
			{
				System.out.println("Peixe");
			}else if(dia >= 21)
			{
				System.out.println("Áries");
			}
			break;
		}
		case 4: {
			if(dia <=19)
			{
				System.out.println("Áries");
			}else if(dia >= 20)
			{
				System.out.println("Touro");
			}
			break;
		}
		case 5: {
			if(dia <=20)
			{
				System.out.println("Touro");
			}else if(dia >= 21)
			{
				System.out.println("Gêmeos");
			}
			break;
		}
		case 6: {
			if(dia <=20)
			{
				System.out.println("Gêmeos");
			}else if(dia >= 21)
			{
				System.out.println("Câncer");
			}
			break;
		}
		case 7: {
			if(dia <=22)
			{
				System.out.println("Câncer");
			}else if(dia >= 23)
			{
				System.out.println("Leão");
			}
			break;
		}
		case 8: {
			if(dia <=22)
			{
				System.out.println("Leão");
			}else if(dia >= 23)
			{
				System.out.println("Virgem");
			}
			break;
		}
		case 9: {
			if(dia <=22)
			{
				System.out.println("Virgem");
			}else if(dia >= 23)
			{
				System.out.println("Libra");
			}
			break;
		}
		case 10: {
			if(dia <=22)
			{
				System.out.println("Libra");
			}else if(dia >= 23)
			{
				System.out.println("Escorpião");
			}
			break;
		}
		case 11: {
			if(dia <=21)
			{
				System.out.println("Escorpião");
			}else if(dia >= 22)
			{
				System.out.println("Sagitário");
			}
			break;
		}
		case 12: {
			if(dia <=21)
			{
				System.out.println("Sagitário");
			}else if(dia >= 22)
			{
				System.out.println("Capricórnio");
			}
			break;
		}
		default:
			System.out.println("Mes invalido");
		}
	}

}
