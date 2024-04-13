import Animais.Cachorro;

public class Main {

	public static void main(String[] args) {
		
		//criei um objeto!
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro("Maby", "Creme", 25, 5.5, 5, "nada");
	
		System.out.println(cachorro2.getNome());
		System.out.println(cachorro2.getPeso());
		
		//executei um método do objeto, uma ação!
		cachorro1.latir();
		
		cachorro1.pegar();
		
		//imprime o retorno do método pegar()
		System.out.println("O cachorro pegou uma " + cachorro1.pegar());
		
		System.out.println("O cachorro está " + cachorro1.interagir("nada"));
		System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
		System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
		
		
	}

}
