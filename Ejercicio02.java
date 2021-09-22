//Práctica: Arreglos 1, Ejercicio02
//Autor: José André Paredes Quispe

import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		boolean continuar = true;
		Student [] estu = new Student[100];
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad, n = 0;
		while (continuar) {
			estu[n] = new Student();
			System.out.println("Ingrese el nombre del estudiante o escriba <q> para terminar");
			nombre = sc.next();
			if (nombre.equals("q")) break;
			System.out.println("Ingrese la edad del estudiante");
			edad = sc.nextInt();
			estu[n].Student(nombre, edad);
			n++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Nombre: " + estu[i].name + "\tEdad: " + estu[i].getAge());
		}
 	}
}
