package Condicional;

import java.util.Scanner;

public class MisturaCombustivel {
	
	public static void main(String[] args) {
		
		double vAgua, vGarrafa, taxaAgua;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o volume da garrafa em Litros: ");
		vGarrafa = ler.nextDouble();
		
		System.out.print("Informe o volume de água em Mililitros: ");
		vAgua = ler.nextDouble() /1000;
		
		ler.close();
		
		taxaAgua = vAgua / vGarrafa * 100;
		
		System.out.println("Proporção: " + taxaAgua + "%");
		
		if(taxaAgua < 20) {
			System.out.println("Proporção muito baixa, risco de explosão");
		}
		else if(taxaAgua > 30 && taxaAgua < 50) {
			System.out.println("Proporçõ ideal");
		}
		else if(taxaAgua > 60) {
			System.out.println("Proporção muito alta, foguete muito pesado");
		}
		else {
			System.out.println("Proporção Aceitavel");
		}
	}
}
