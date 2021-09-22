import java.util.Scanner;

//Pr�ctica: Arreglos 1, Ejercicio03
//Autor: Jos� Andr� Paredes Quispe

public class Ejercicio03 {
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
		//Conseguir el estudiante m�s viejo y m�s joven
		int maxAge = 0, minAge = 1000;
		for (int i = 0; i < n; i++) {
			if (maxAge < estu[i].getAge()) maxAge = estu[i].getAge();
			if (minAge > estu[i].getAge()) minAge = estu[i].getAge();
		}
		
		
		for (int i = 0; i < n; i++) {
			if (maxAge == estu[i].getAge()) System.out.println("Estudiante mayor:\nNombre: " + estu[i].name + "\tEdad: " + estu[i].getAge());
			if (minAge == estu[i].getAge()) System.out.println("Estudiante menor:\nNombre: " + estu[i].name + "\tEdad: " + estu[i].getAge());
		}
	}
}
