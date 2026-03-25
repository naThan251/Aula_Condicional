package Condicional;

import java.util.Random;

public class SorteadorAluno {

	public static void main(String[] args) {

		int numAluno;
		Random ale = new Random();

		numAluno = ale.nextInt(30) + 1;

		System.out.println("Aluno " + numAluno);
	}

}
