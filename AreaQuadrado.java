package AV_FORMATIVA;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int lado;
		
		System.out.print("Informe o valor do lados: ");
		lado= ler.nextInt();
		lado = lado * lado;
		
		System.out.print("A área do quadrado é: " +lado);
		ler.close();
		

	}

}
