package Animais;

public class Cachorro {
	//atributos
	
	static int numeroDeCachorros;
	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private int tamanhoDoRabo;
	private String estadoDeEspirito;
	
	//construtor padrão, constroi objeto com valores default
	public Cachorro() {}
	
	//Construtores adicionados com todos atributos
	public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.tamanhoDoRabo = tamanhoDoRabo;
		this.estadoDeEspirito = estadoDeEspirito;
		
		numeroDeCachorros ++;
	}

	//metodos
	
	
	public String getNome() {
		return this.nome;
	}
	
	public static int getNumeroDeCachorros() {
		return numeroDeCachorros;
	}

	public static void setNumeroDeCachorros(int numeroDeCachorros) {
		Cachorro.numeroDeCachorros = numeroDeCachorros;
	}

	public void setNome(String nome) {
		//com o this eu mostro para o java que eu quero o atributo dessa classe
		//as cores no eclipse "mostram" isso na prática
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoDoRabo() {
		return tamanhoDoRabo;
	}

	public void setTamanhoDoRabo(int tamanhoDoRabo) {
		this.tamanhoDoRabo = tamanhoDoRabo;
	}

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
		
		switch (acao) {
		case "carinho": this.estadoDeEspirito = "feliz"; break;
		case "vai dormir!": this.estadoDeEspirito = "Bravo"; break;
		case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
		default: this.estadoDeEspirito = "Neutro";break;
		}

		return estadoDeEspirito;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + "]";
	}
	
	
}
