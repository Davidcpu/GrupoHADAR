/**
 * Crear un TDA que defina las operaciones de un conjunto (set).
 * Se almacenan valores �nicos.
 * Ser�n enteros (en este caso).
 * Operaciones: union, interseccion, complemento.
 */

package conjunto;

public class Conjunto {
	// Atributos (variables)
	private boolean[] universo;
	
	// Metodo constructor: inicializa el array
	public Conjunto(int size) {
		// Inicializa el array con el tama�o establecido.
		// Incluyendo el propio tama�o.
		this.universo = new boolean[size +1];                    //t1 = 1
	}
	
	// Metodos para manipular elementos dentro del universo
	public void agregar(int valor) {
 		universo[valor] = true;                                 //t2 = 1
	}

	public void agregarmas(int[] valor) {
		for (int i = 0; i < valor.length; i++) {                //t3 = 1 + n+1 + n
			int dato = 0;                                       //t4 = n
			dato = valor[i];                                    //t5 = n
			if (dato >= 0 && dato < this.universo.length) {     //t6 = n
					universo[dato] = true;                      //t7 = n
					
			}
			
		}
	}
	
	//Metodo para eliminar varios elementos
	public void removermas(int[] valor) {
		for( int i = 0; i < valor.length; i++) {                 //t8 = 1+n+1 + n 
			int dato = 0;                                        //t9 = n
			dato = valor[i];                                     //t10 = n
			if (dato >= 0 && dato < this.universo.length) {      //t11 = n
				universo[dato] = false;                          //t12 = n
				}
		}
	}
	
	
	public void remover(int valor) {
		universo[valor] = false;                                  //t13 = 1
	}
	
	// Se asume que ambos conjuntos tienen el mismo universo
	public Conjunto union(Conjunto otro) {
		Conjunto aux = new Conjunto(this.universo.length);        //t14 = 1
		
		for (int i = 0; i < universo.length; i++) {               //t15 = 1 + n+1 + n
			if (this.universo[i] || otro.universo[i]) {           //t16 = k
				aux.universo[i] = true;                           //t17 = k
			}
		}
		
		return aux;                                               //t18 = 1
	}
	
	public Conjunto interseccion(Conjunto otro) {
		Conjunto aux = new Conjunto(this.universo.length);        //t19 = 1
		
		for (int i = 0; i < universo.length; i++) {               //t20 = 1 + n+1 + n
			if (this.universo[i] && otro.universo[i]) {           //t21 = k
				aux.universo[i] = true;                           //t22 = k
			}
		}
		
		return aux;                                               //t23 = 1
	}
	
	public Conjunto complemento() {
		Conjunto aux = new Conjunto(this.universo.length);        //t24 = 1
		
		for (int i = 0; i < this.universo.length; i++) {          //t25 = 1 + n+1 + n
			aux.universo[i] = !this.universo[i];                  //t26 = k
		}
		
		return aux;                                               //t27 = 1
	}
	
	public boolean pertenece(int valor) {
		return this.universo[valor];
	}
	
	@Override
	public String toString() {
		// Se utilizar� StringBuilder para mejorar el uso
		// de concatenacion de String
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		for (int i = 0; i < universo.length; i++) {
			if (universo[i]) {
				sb.append(i);
				sb.append(",");
			}			
		}
		sb.append("}");
		return sb.toString();
	}
	
}
