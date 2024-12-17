package com.ejercicio7;

import java.util.Scanner;

public class Vertice_Triagulo_Superficie {

	public static void main(String[] args) {
		//Construya el algoritmo tal que, dadas las coordenadas de los puntos P1, P2 y P3,
		//que corresponden a los vértices de un triángulo, calcule su superficie. Donde:
		//X1 y Y1 representan las coordenadas en el eje de las X y las Y, del punto P1.
		//X2 y Y2 expresan las coordenadas en el eje de las X y las Y, del punto P2.
		//X3 y Y3 representan las coordenadas en el eje de las X y las Y, del punto P3.
		Scanner entrada = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, area;
		//Leer los datos
		System.out.println("Ingresa la cordenada de x1: ");
		x1 = entrada.nextDouble();
		System.out.println("Ingresa la cordenada de y1: ");
		y1 = entrada.nextDouble();
		System.out.println("Ingresa la cordenada de x2: ");
		x2 = entrada.nextDouble();
		System.out.println("Ingresa la cordenada de y2: ");
		y2 = entrada.nextDouble();
		System.out.println("Ingresa la cordenada de x3: ");
		x3 = entrada.nextDouble();
		System.out.println("Ingresa la cordenada de y3: ");
		y3 = entrada.nextDouble();
		//
		area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2;
		System.out.println("El Area del Triangulo con respecto a sus Vertices es: "+ area);
	}

}
