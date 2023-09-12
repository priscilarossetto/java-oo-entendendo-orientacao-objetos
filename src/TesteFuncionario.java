
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario priscila = new Funcionario();
		priscila.setNome("Priscila Rossetto");
		priscila.setCpf("123456789-23");
		priscila.setSalario(2600.00);
		
		System.out.println(priscila.getNome());
		System.out.println(priscila.getBonificacao());

	}

}
