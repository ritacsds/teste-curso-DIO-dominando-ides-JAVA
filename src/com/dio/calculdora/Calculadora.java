package com.dio.calculdora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o valor 1: ");
		a = scan.nextInt();
		System.out.println("Digite o valor 2: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		
		int subtracao = subtracao(a, b);
		
		int multiplicacao = multiplicacao(a, b);
		
		double divisao = divisao(a, b);
		
		System.out.println("soma " + soma);
		System.out.println("subtracao " + subtracao);
		System.out.println("multiplicacao " + multiplicacao);
		System.out.println("divisao " + divisao);
					
	}
	
	public static int soma (int a, int b) {
		return a+b;
	}
	
	
	public static int subtracao (int a, int b) {
		return a-b;
	}

	public static double divisao (int a, int b) {
		return ((double)a/b);
	}

	public static int multiplicacao (int a, int b) {
		return a*b;
	}
}