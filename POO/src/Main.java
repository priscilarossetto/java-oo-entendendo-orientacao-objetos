import Animais.Cachorro;

public class Main {

	public static void main(String[] args) {
		
		//criei um objeto!
		Cachorro cachorro1 = new Cachorro();
		
		//defini as variaveis dele:
		cachorro1.nome = "Milka";
		cachorro1.cor = "Marron";
		cachorro1.altura = 80;
		cachorro1.peso = 16.0;
		cachorro1.tamanhoDoRabo = 25;
		
		
		//executei um método do objeto, uma ação!
		cachorro1.latir();
		
		cachorro1.pegar();
		
		//imprime o retorno do método pegar()
		System.out.println("O cachorro pegou uma " + cachorro1.pegar());
		
		System.out.println("O cachorro está " + cachorro1.interagir("nada"));
		System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
		System.out.println("O cachorro está " + cachorro1.interagir("vair dormir!"));
	}

}
