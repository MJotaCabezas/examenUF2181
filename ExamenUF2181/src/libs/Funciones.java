
/**
 * @author Manuel Jesús Cabezas Arenas
 *
 */

package libs;


public class Funciones {
	
	
	/**
	 * Función que inserta 3 números y devuelve el valor medio.
	 * @param num1 entero, primer número a introducir de la lista.
	 * @param num2 entero, segundo número a introducir de la lista.
	 * @param num3 entero, tercer número a introducir de la lista.
	 * @return devuelve un entero del número medio.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	
	/**
	 * Función que devuelve un boolean con un true o false según el año a introducir; si es bisiesto, true y al contrario false.
	 * @param año entero, el año a introducir.
	 * @return un boolean de bisiesto, true o false según el año.
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto =false;
		if (año %4 == 0 ) {
		if (año%100==0 && año%400!=0) {
		bisiesto=false;
		} else {
		bisiesto=true;
		}
		} else {
		bisiesto=false;
		}
		return bisiesto;
		
	}
	
	/**
	 * Función que sirve para determinar si un vector insertado, es capicúa o no.
	 * @param v tipo entero, inserta un vector para determinar si es capicúa o no.
	 * @return devuelve un boolean de true o false según si es capicúa o no. Depende de la lista de números introducida.
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	
	/**
	 * Función que sirve para sumar dos vectores introducidos. De modo que si tenemos 1,2,3 en un vector y 
	 * 4,5,6 en otro; nos devolverá 5,7,9.
	 * @param v vector 1 a introducir de tipo entero.
	 * @param v2 vector 2 a introducir de tipo entero.
	 * @return devuelve la suma de los dos vectores introducidos de tipo enteros.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
