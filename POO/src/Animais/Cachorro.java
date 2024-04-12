package Animais;

public class Cachorro {
	
	public String nome;
	public String cor;
	public int altura;
	public double peso;
	public int tamanhoDoRabo;
	
	
	public String estadoDeEspirito;
	
	
	//definindo um metodo
	//O método é publico
	//não tem retorno
	//tem o nome Comer
	//não recebe variavel nenhuma
	//não faz nada
	public void comer() {}
	
	public void latir() {
		System.out.println("AU AU");
	}
	
	//método com retorno
	public String pegar() {
		return "Bolinha";
	}
	
	//o metodo aqui vai receber uma String acao
	//equals compara as Strings
	public String interagir(String acao) {
		if(acao.equals("carinho")) {
			this.estadoDeEspirito = "feliz";
		}else if(acao.equals("vai dormir!")){
			this.estadoDeEspirito = "Bravo";
		}else {
			this.estadoDeEspirito = "neutro";
		}
		return estadoDeEspirito;
	}
}
