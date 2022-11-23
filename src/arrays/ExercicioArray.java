package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioArray {
	public static void main(String[] args) {
		//usuario informa o tamanho do array
		
		Scanner c1 = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		int n = c1.nextInt();
		
		double[] notas = new double[n];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + ((int) i + 1));
			notas[i] = c1.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		double media = soma/notas.length;
		System.out.println("A média das notas é: " + media);
	}
}
