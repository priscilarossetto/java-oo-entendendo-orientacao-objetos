import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

	public static void main(String[] args) {
		
		//criei um objeto!
		Cachorro cachorro1 = new Cachorro("Milka", "Marrom", 65, 16.0, 10, "nada");
		Gato gato1 = new Gato("Felix", "Preto", 4.5);
		Passaro passaro1 = new Passaro("Frajola", "Amarelo", 0.5);
		cachorro1.soar();
		gato1.soar();
		passaro1.soar();
		
		int _$teste_$ = 2;
		double ______ = 23.3;
		
		int inteiro; //int, long, byte = 0;
		float $$; // double e float = 0.0
		boolean $87; //boolean tem como default false
		char ch; // char é vazio
		String teste; // valor default de qualquer objeto é null
		
		//casting quando o Java não consegue mudar uma coisa para outra e você indica isso para ele.
		//quando um valor maior  para transformar em algo menor, precisa do casting.
		double d = 5.5d;
		float f = 3.00f;
		
		float x = f + (float) d;
		
		System.out.println(x);
	}

}