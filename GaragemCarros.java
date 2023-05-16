package AV_FORMATIVA;

import java.util.Scanner;

public class GaragemCarros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String automoveis[] = new String[6];
		
		for(int i = 0; i<6; i++) {
			System.out.println(" Diga os nomes dos super-carros: ");
			automoveis[i]= ler.nextLine();
		}
		
		for(int i = 0; i<6; i++) {
			System.out.println(" Os super-carros são: " + automoveis[i]);
		}

	}

}
