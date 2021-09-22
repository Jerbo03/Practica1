//Práctica: Arreglos 1, Ejercicio01
//Autor: José André Paredes Quispe

import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		String[] pasajeros = new String[16];
		String[] temp = new String[16];
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while (n <= 16) {
			System.out.println("Ingrese el nombre del nuevo pasajero");
			String nuevo = sc.next();
			System.out.println("Ingrese el número de su asiento (1 - 16)");
			int asiento = sc.nextInt();
			asiento -= 1;
			
			System.arraycopy(pasajeros, 0, temp, 0, asiento);
			if (pasajeros[asiento] != null) System.arraycopy(pasajeros, asiento, temp, (asiento + 1), (15 - asiento));
			else System.arraycopy(pasajeros, asiento, temp, asiento, (15 - asiento));
			temp[asiento] = nuevo;
			System.arraycopy(temp, 0, pasajeros, 0, 16);
			System.out.print("[");
			for (int i = 0; i < 16; i++) {
				if (pasajeros[i] != null) System.out.print(pasajeros[i] + " ");
				else System.out.print("_ ");
			}
			System.out.println("]");
		}
	}
}
