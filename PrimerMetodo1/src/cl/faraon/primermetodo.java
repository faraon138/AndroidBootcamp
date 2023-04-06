package cl.faraon;
import java.util.Scanner;

public class primermetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n1, n2, suma, resta;

int resultadosuma;
		
		//Scanner
		
		Scanner scan = new Scanner(System.in);
		
		//lectura de datos
		
		System.out.println("Ingrese el primer numero");
		n1 = scan.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		n2 = scan.nextInt();
		
		//resultado de la operacion
		
		 resultadosuma = sumar(n1,n2);
		
		//vista del resultado de la operacion
		
		System.out.println ("La suma es " + resultadosuma);
		
		//cierre del scanner
		scan.close();
		
		
		
	}
	
	public static int sumar(int a, int b) { 
		
		int resultado;
		resultado = a+b;
		return resultado;
		
	}
	

}
