package AV_FORMATIVA;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor1, valor2, resultados;
		String operador;
		
		System.out.print("Informe o valor 1: ");
		
		valor1 = ler.nextInt();
		
		System.out.print("Informe o valor 2: ");
		valor2 = ler.nextInt();
		
		System.out.print("Escolha a operação -, * ou +");
		operador = ler.next();
		
		if(operador.equals("-")){
			resultados = valor1 - valor2;
			System.out.print("A subtração é: " +resultados);
			System.exit(0);
		}
		if(operador.equals("*")){
			resultados = valor1 * valor2;
			System.out.print("A multiplicação é: " +resultados);
			System.exit(0);
		}
		if(operador.equals("+")){
			resultados = valor1 + valor2;
			System.out.print("A soma é: " +resultados);
			System.exit(0);
		}
				
		
		
		 
		

	}

}
