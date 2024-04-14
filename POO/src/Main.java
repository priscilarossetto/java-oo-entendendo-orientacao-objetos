import Animais.Cachorro;

public class Main {

	public static void main(String[] args) {
		
		//criei um objeto!
		Cachorro cachorro1 = new Cachorro("Milka", "Marrom", 65, 16.0, 10, "nada");
		
		System.out.println(cachorro1.getNumeroDeCachorros());
		
		Cachorro cachorro2 = new Cachorro("Maby", "Creme", 25, 5.5, 5, "nada");
		
		System.out.println(cachorro2.getNumeroDeCachorros());
		System.out.println(cachorro1.getNumeroDeCachorros());
		
	}

}
