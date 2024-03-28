import Animais.Cachorro;

public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		
		//criando o objeto cachorro na memória da JVM.
		
		cachorro1.nome = "Milka";
		cachorro1.cor = "Marron";
		cachorro1.altura = 60;
		cachorro1.peso = 15.5;
		cachorro1.tamanhoDoRabo = 10;
		
		//definindo na memória um  objeto com esses atributos.
		
		System.out.println(cachorro1);
		
	}

}
