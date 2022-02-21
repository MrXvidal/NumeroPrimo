package ArrayNombre;

public class Primo {



	public static void main(String[] args) {		

		/* En la siguiente variable selecionaremos el numero a evaluar

		 * podriamos usar la libreia Scanner para pasar este numero por consola

		 */		

		int num = 7;

		boolean loEs = comprobadorPrimo(num); // declaramos la variable del bolleano que generaremos luego			

			System.out.println("Pues " + num + " es primo? " + loEs); // nos printael resultado

	}

	/* Generamos un booleano para tener la operacion

	 * a continuacion generamos el codigo

	 */
	

	public static boolean comprobadorPrimo(int num) {

	boolean loEs = false;

	int divisores = 0;

	int comprovadorDivisor = 2;	

	// creamos un for para generar la comprovacion divisoria	

	for(int i=1; i<=num; i++)

		// continuamos con los condicionales If

		if(num % i == 0)

			divisores++;

	if( divisores == comprovadorDivisor)

		loEs = true;

	

	return loEs;

 }

}

