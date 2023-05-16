package AV_FORMATIVA;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int rdmbingo[] = new int[20];
		
		for(int i = 0; i< 20; i++) {
			rdmbingo[i] = (int)Math.round(Math.random()*100);
		}
		for(int i = 0; i< 20; i++) {
			System.out.println(" Os números aleatórios são: " + rdmbingo [i]);
		}
		
		
		
	}

}
