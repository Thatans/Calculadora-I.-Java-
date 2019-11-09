package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		double num1;
		double num2, soma, subtracao, multi, divi;
		

		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println(num1+ "+" + num2 ""=""" soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtracao);
		
		multi = num1 * num2;
		divi = num1 / num2;
		
		System.out.println("O resultado da multiplicação é: " + multi);
		System.out.println("O resultado da divisão é: " + divi);
		
		
	}

}
