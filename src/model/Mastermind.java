package model;

import java.util.Arrays;
import java.util.Random;

import view.IoManager;

public class Mastermind {
	private int[][] tablero;
	private int[] fijas;
	private int[] picas;
	private int[] numeroOculto;
	private int intentos;

	public Mastermind() {
		this.tablero = new int[10][4];
		this.fijas = new int[10];
		this.picas = new int[10];
		this.numeroOculto = new int [4];
		this.intentos=10;
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j]=0;
			}
		}
		for (int i = 0; i < fijas.length; i++) {
			fijas[i]=0;
		}
		for (int i = 0; i < picas.length; i++) {
			picas[i]=0;
		}
		
		
	}

	// Llamar a la función generar numero aleatorio y llenar el vector numero
	// oculto, teniendo en cuenta que los numeros no se pueden repetir y el numero
	// el la primera posicion tiene que ser distionto de cero.
	public void llenarNumeroOculto() {

	}

	// Toma cada caracter del string, lo convierte a entero y lo ingresa en en la
	// fila del intento correspondiente.
	public void ingresarIntento(String numero) {

	}

	// Compara la fila del intento en el tablero con el numero oculto, si son
	// iguales retorna true, de lo contrario retorna false;
	public boolean evaluarIntento() {
		boolean intento = false;

		return intento;
	}

	// Compara la fila del intento con el numero oculto, el numero de valores que
	// coninciden son asignados al vector picas en la posición intentos.
	public void generarPicas() {

	}
	//Compara la fila del intento con el vector de el numero oculto, determina el numero de
	//valores que coinciden en posicion y valor; y lo asigna a el vector fojas en la posicion intentos.
	public void generarFijas() {

	}
	// Imprimir una matriz de diez filas por cuatro columnas, y los vectores de picas y fijas.
	public String imprimirJuego () {
		String tablero="";
		
		return tablero; 
	}
	
	// Corre el juego.
	public void juego() {
		IoManager iotemp = new IoManager();
		this.llenarNumeroOculto();
		do {
		 this.ingresarIntento(iotemp.readString("Ingresa un numero"));
		 intentos--;
		 if(this.evaluarIntento()) {
			 iotemp.showMessage("Ganaste");
		 }else {
			 this.generarFijas();
			 this.generarPicas();
			 this.imprimirJuego();
		 }
		}while(!this.evaluarIntento() && intentos >=0); 
		
		if(intentos==0) {
			iotemp.showMessage("Se agotaron los intentos");
			iotemp.showMessage("El numero oculto es: " + Arrays.toString(numeroOculto));
		}
	}
	
	// Genera un numero aleatorio.
	public int getRandomNumber(int min, int max) {
		Random numberRandom = new Random();
		int random = numberRandom.nextInt((max - min) + 1) + (min);
		return random;

	}

}
