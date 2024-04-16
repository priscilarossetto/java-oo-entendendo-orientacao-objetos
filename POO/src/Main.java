import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

	public static void main(String[] args) {
		
		//criei um objeto!
		Cachorro cachorro1 = new Cachorro("Milka", "Marrom", 65, 16.0, 10, "nada");
		
		Gato gato1 = new Gato("Felix", "Preto", 4.5);
		
		Passaro passaro1 = new Passaro("Frajola", "Amarelo", 0.5);
		
		cachorro1.soar();
		gato1.soar();
		passaro1.soar();
	}

}
