public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());
		
		Cliente priscila = new Cliente();
		priscila.setNome("priscila rossetto");
		
		conta.setTitular(priscila);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		System.out.println(titularDaConta);
		System.out.println(priscila);
		System.out.println(conta.getTitular());
	}
}
