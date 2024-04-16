package Animais;

//agora o Passaro é uma classe filha de Animal
public class Passaro extends Animal{

	static int numeroDePassaros;
	
	public Passaro(String nome, String cor, double peso) {
		super(nome, cor, peso);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void soar() {
		// TODO Auto-generated method stub
		System.out.println("PIU PIU!!");
	}

}
