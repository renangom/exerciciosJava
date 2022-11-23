package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total= 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.println("Insira a nota " + ((int) j + 1) + " do aluno " + ((int) i+1));
				notasDaTurma[i][j] = entrada.nextDouble();
				
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total /(qtdeAlunos*qtdeNotas);
		System.out.println("A média da turma é " + media);
		
		entrada.close();
	}
}	
