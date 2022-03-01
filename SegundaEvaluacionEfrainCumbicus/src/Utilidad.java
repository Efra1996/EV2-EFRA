
/**
 * 
 * @author Efrain cumbicus
 * @since 01/03/2022
 * @version Examen EV2
 *
 */
public class Utilidad {

	/**
	 * 
	 * @param a
	 * @return 
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	/**
	 * 
	 * @param n
	 * @return EL FACTORIAL
	 */
	
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return (CODIGO REFACTORIZADO) BOOLEAN SI ES PRIMO O NO
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		return primo(d);
		
		
	}
	/**
	 * Hemos pasado del bloque de codigo a metodo
	 * 
	 * @return devuelve boolean si es primo o no 
	 */
		public boolean primo(int d) {
			boolean esPrimo = true;
			for (int i=2;i<d;i++) {
				if (d%i==0) {
					esPrimo = false;
				}
			}
			
			// eliminamos la variable resultado
			return (esPrimo);// ponemos aqui el resultado 
			
		}
	
}
