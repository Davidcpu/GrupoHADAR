package conjunto;

public class Main {
	public static void main(String[] args) {

		
		Conjunto cc = new Conjunto(14);
		int elementos[] = {1,9,-5,13,14,15,-112,7,-14,4,13,20,24};
		int elementos2[] = {1,9,-4,10,220};
		cc.agregarmas(elementos);
		cc.removermas(elementos2);
		
		System.out.println("Validacion1: Solo se guardaran valores dentro del rango de conjunto cc");
		System.out.println("Validacion2: Solo se borraran valores dentro del rango de conjunto cc");
		System.out.println("Conjunto cc");
		System.out.println(cc);

			
		String s1 = "Hola";
		String s2 = "Ho";
		String s3 = "la";
		String s4 = s2+s3;
		System.out.println("Es igual " + s1.equals(s4));
	}
}
