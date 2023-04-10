/*
 * Esta aplicacion nos permite comparar dos fechas e imprimir la mas alta
 */

package cl.desafiolatam;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String fecha1; 	String f1d;
				String f1m; 
				String f1a;
				
String fecha2; 	String f2d;
				String f2m;
				String f2a;  //variables donde se almacenan los días, meses y años que ingrese el usuario

String fmayor; // variable donde se almacena el resultado de la comparación

		Scanner scan=new Scanner(System.in);

		System.out.println("Ingrese primera fecha como DD/MM/AAAA"); 				// se pide ingresa primera fecha
		fecha1 = scan.next();									// captura fecha
		f1d = fecha1.substring(0, 2); 								// extrae los numeros del dia
		int f1dia = Integer.parseInt(f1d);							// transforma los numeros capturados de string a integer a una nueva variable
		f1m = fecha1.substring(3, 5); 								// extrae los numeros del mes
		int f1mes= Integer.parseInt(f1m);							// transforma los numeros capturados de string a integer a una nueva variable
		f1a = fecha1.substring(6, 10); 								// extrae los numeros del año
		int f1ano = Integer.parseInt(f1a);							// transforma los numeros capturados de string a integer a una nueva variable
		
		System.out.println("Ingrese segunda fecha como DD/MM/AAAA"); 				// se pide ingresa primera fecha
		fecha2 = scan.next();										// captura fecha
		f2d = fecha2.substring(0, 2); 								// extrae los numeros del dia
		int f2dia = Integer.parseInt(f2d);							// transforma los numeros capturados de string a integer a una nueva variable
		f2m = fecha2.substring(3, 5); 								// extrae los numeros del mes
		int f2mes= Integer.parseInt(f2m);							// transforma los numeros capturados de string a integer a una nueva variable
		f2a = fecha2.substring(6, 10); 								// extrae los numeros del año
		int f2ano = Integer.parseInt(f2a);							// transforma los numeros capturados de string a integer a una nueva variable
			
		
		
		if (f2ano == f1ano && f2mes == f1mes && f1dia == f2dia){ 			//verifica si los años, meses y dias son iguales, da respuesta tienen misma edad
			System.out.println("Tienen la misma edad");
		} else if (f2ano == f1ano && f2mes == f1mes && f1dia > f2dia) {  		//verifica si año y mes son iguales, que dia es mayor
			System.out.println("La persona 2 es mayor");
		} else if (f2ano == f1ano && f2mes == f1mes && f1dia < f2dia) {
			 System.out.println("La persona 1 es mayor");
		} else if (f2ano == f1ano && f2mes > f1mes) {					// verifica si año son iguales, que mes es mayor
			 System.out.println("La persona 1 es mayor");
		} else if (f2ano == f1ano && f2mes < f1mes) {
			 System.out.println("La persona 2 es mayor");
		} else if (f2ano > f1ano) {							// verifica que año es mayor
			 System.out.println("La persona 1 es mayor");	 
		} else if (f2ano < f1ano) {
			 System.out.println("La persona 2 es mayor");	 
		} 
		scan.close();  //cierre escaner
	
	
		
	}

}
