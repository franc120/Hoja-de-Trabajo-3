import java.util.ArrayList;
import java.util.Random;
public class RandomNumberGeneration {

	public static void main(String[] args) {
		// creando numeros random
	}
		public static ArrayList<Integer> generarAleatoriosNoRepetidos (int cantidad) {
			ArrayList<Integer> respuesta = new ArrayList<>();
			for (int i = 0; i < cantidad; i++) {
				respuesta.add(gen(respuesta));
			}			
			return respuesta;
	}

		public static int gen(ArrayList<Integer>a) {
			Random ra = new Random();	
			int numero = ra.nextInt(10);
			if (!a.contains(numero)) {
				return numero;
			}else {
				return gen(a);
			}
		}
}
		

