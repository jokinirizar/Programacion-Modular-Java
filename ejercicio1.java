package ejerciciosJon;
//while (sc.hashNextInt(){
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cantidadAlumnos;
		
		String arrayAlumnos[][];
		
		cantidadAlumnos= preguntarCantidad(sc);
		
		arrayAlumnos=nombreEdad( sc, cantidadAlumnos);
		
		imprimirArray(arrayAlumnos);
		
		mediaEdad(arrayAlumnos);
		
		edadMayor(arrayAlumnos);
		
		edadMenor(arrayAlumnos);
		
		nombreLargo(arrayAlumnos);

		sc.close();
	}



	


	public static int preguntarCantidad(Scanner sc) {


		System.out.println("Introduzca la cantidad de alumnos/as que desea matricular"); 
		String cantidadString=sc.nextLine();
		int cantidadInt=0;
		boolean done=false;
		while (!done) {
			while(!done) {
				if(cantidadString.matches("[1-9][0-9]*")) {
					cantidadInt=Integer.parseInt(cantidadString.trim());
					done=true;
				}
				else {
					System.out.println("La cantidad de alumnos debe ser un entero positivo");
					cantidadString=sc.nextLine();
				}

			}
		}
     
		return cantidadInt;

	}





	public static String[][] nombreEdad(Scanner sc,int cantidad) {

		String array[][]=new String[cantidad][2];
		String edadAlumno;
		Boolean done;
		for(int i=0; i<cantidad; i++) {
			System.out.println("Introduzca el nombre del alumno/a "+ (i+1));
			array[i][0]=sc.nextLine();
			done=false;
			while(!done) {
				System.out.println("Introduzca la edad del alumno/a "+ (i+1));
				edadAlumno=sc.nextLine();
				if(edadAlumno.matches("[0-9]+")) {
					array[i][1]=edadAlumno;
					done=true;
				}
				else {
					System.out.println("La edad debe ser un número entero, introduzca uno válido");
					edadAlumno=sc.nextLine();
				}

			}

		}
		return array;	
	}





	public static void imprimirArray(String arrayAlumnos[][]) {
		for(int i=0; i<arrayAlumnos.length; i++) {
			System.out.println(" ");
			for(int j=0; j<arrayAlumnos[1].length; j++) {
				System.out.print(arrayAlumnos[i][j]+ " ");
			}
			System.out.println("");
		}
	}





	public static void mediaEdad(String arrayAlumnos[][]) {
		double media=0;
		for(int i=0; i<arrayAlumnos.length; i++) {
			media = media+ Integer.parseInt(arrayAlumnos[i][1].trim());
		}
		media=media/arrayAlumnos[0].length;
		System.out.println(" ");
		System.out.println("La media es: "+ media);
		
	}





	public static void edadMayor (String arrayAlumnos[][]) {
		int mayor=0;
		String nombre="example";
		for(int i=0; i<arrayAlumnos.length; i++) {

			for(int j=0; j<arrayAlumnos[1].length; j++) {
				if(mayor<Integer.parseInt(arrayAlumnos[i][1].trim()))
				{
					mayor=Integer.parseInt(arrayAlumnos[i][1].trim());
					nombre=arrayAlumnos[i][0];
				}
			}
		}
		System.out.println(" ");
		System.out.println("El/La alumno/a con mayor edad  es: " + nombre);
		System.out.println("con  " + mayor + " años de edad");
	}





	public static void edadMenor (String arrayAlumnos[][]) {
		int menor=Integer.parseInt(arrayAlumnos[0][1].trim());
		String nombre=arrayAlumnos[0][0];
		for(int i=0; i<arrayAlumnos.length; i++) {

			for(int j=0; j<arrayAlumnos[1].length; j++) {
				if(menor>Integer.parseInt(arrayAlumnos[i][1].trim()))
				{
					menor=Integer.parseInt(arrayAlumnos[i][1].trim());
					nombre=arrayAlumnos[i][0];
				}
			}
		}
		System.out.println(" ");
		System.out.println("El/La alumno/a con menor edad  es: " + nombre);
		System.out.println("con  " + menor + " años de edad");
	}





	public static void nombreLargo (String arrayAlumnos[][]) {
		String nombre="i";
		for(int i=0; i<arrayAlumnos.length; i++) {

			for(int j=0; j<arrayAlumnos[1].length; j++) {
				if(nombre.length()<arrayAlumnos[i][0].length())
				{
					nombre=arrayAlumnos[i][0];
				}
			}
		}
		System.out.println(" ");
		System.out.println("El/La alumno/a con el nombre más largo es: " + nombre);
		System.out.println("con  " + nombre.length() + " Letras");
	}


}

