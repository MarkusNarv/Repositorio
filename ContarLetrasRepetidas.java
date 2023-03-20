
import java.util.HashMap;
import java.util.Map;

public class ContarLetrasRepetidas {

	public static void main(String[] args) {
		
	String texto = "1112225887";
	Map<Character, Integer> frecuencias = new HashMap<>();

		        // Iterar sobre cada caracter en la cadena de texto
		        for (int i = 0; i < texto.length(); i++) {
		            char caracter = texto.charAt(i);

		            // Si el caracter actual no está presente en el Map, agregarlo con una frecuencia de 1.
		            // De lo contrario, aumentar su frecuencia en 1.
		            if (!frecuencias.containsKey(caracter)) {
		                frecuencias.put(caracter, 1);
		            } else {
		                int frecuenciaActual = frecuencias.get(caracter);
		                frecuencias.put(caracter, frecuenciaActual + 1);
		            }
		        }

		        // Imprimir los resultados
		        System.out.println("Frecuencia de letras en el texto: ");
		        for (Map.Entry<Character, Integer> entry : frecuencias.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		
	}


