package AV_FORMATIVA;

import java.util.Scanner;

public class CelsiusFr {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
				
		double celsius, fahrenheit;
		
		System.out.print("Informe Os graus em fahrenheit: ");
		fahrenheit = ler.nextDouble();
		
		celsius = (fahrenheit-32)*5/9;
		
		System.out.print("A conversão é: " +celsius);
		ler.close();
		
	}

}
