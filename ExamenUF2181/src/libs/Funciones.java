
/**
 * @author Manuel Jes�s Cabezas Arenas
 *
 */

package libs;


public class Funciones {
	
	
	/**
	 * Funci�n que inserta 3 n�meros y devuelve el valor medio.
	 * @param num1 entero, primer n�mero a introducir de la lista.
	 * @param num2 entero, segundo n�mero a introducir de la lista.
	 * @param num3 entero, tercer n�mero a introducir de la lista.
	 * @return devuelve un entero del n�mero medio.
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
	 * Funci�n que devuelve un boolean con un true o false seg�n el a�o a introducir; si es bisiesto, true y al contrario false.
	 * @param a�o entero, el a�o a introducir.
	 * @return un boolean de bisiesto, true o false seg�n el a�o.
	 */
	public boolean esBisiesto(int a�o) {
		boolean bisiesto =false;
		if (a�o %4 == 0 ) {
		if (a�o%100==0 && a�o%400!=0) {
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
	 * Funci�n que sirve para determinar si un vector insertado, es capic�a o no.
	 * @param v tipo entero, inserta un vector para determinar si es capic�a o no.
	 * @return devuelve un boolean de true o false seg�n si es capic�a o no. Depende de la lista de n�meros introducida.
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
	 * Funci�n que sirve para sumar dos vectores introducidos. De modo que si tenemos 1,2,3 en un vector y 
	 * 4,5,6 en otro; nos devolver� 5,7,9.
	 * @param v vector 1 a introducir de tipo entero.
	 * @param v2 vector 2 a introducir de tipo entero.
	 * @return devuelve la suma de los dos vectores introducidos de tipo enteros.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
