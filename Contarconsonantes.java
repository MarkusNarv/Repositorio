
public class Contarconsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "HOlA MUnDO como estas en este dia soleado";
		int contadorConsonantes = 0;

		for (int i = 0; i < texto.length(); i++) {
		    char letra = texto.charAt(i);
		    if (Character.isLetter(letra) && !isVowell(letra)) {
		        contadorConsonantes++;
		    }
		}

		System.out.println("La cantidad de consonantes en el texto es: " + contadorConsonantes);
	}

	private static boolean isVowell(char letra) {
		// TODO Auto-generated method stub
		letra = Character.toLowerCase(letra);
	    return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
	}

}
