package com.br.calcula.velocidade;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tempo gasto em horas:");
		double tempoGasto = entrada.nextInt();
		System.out.println("Velocidade média em km/h:");
		double velocidadeMedia = entrada.nextInt();
		
		double distancia = tempoGasto * velocidadeMedia;
		
		double litrosUsados = distancia/12;
		
		System.out.println("A velocidade média é: " + velocidadeMedia + "km/h");
		System.out.println("O tempo gasto foi de: " + tempoGasto + "hrs");
		System.out.println("A distancia percorrida foi: " + distancia + "km");
		System.out.println("E a quantidade de litros utilizados foi de: " + litrosUsados);
		
		
	}

}
