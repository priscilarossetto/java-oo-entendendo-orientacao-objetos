
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente priscila = new Cliente();
		priscila.nome = "Priscila Rossetto";
		priscila.cpf = "123.456.789-22";
		priscila.profissao = "programadora";
		
		Conta contaDaPriscila = new Conta();
		contaDaPriscila.deposita(100);
		
		contaDaPriscila.titular = priscila;
		System.out.println(contaDaPriscila.titular.nome);
		System.out.println(contaDaPriscila.titular);
		System.out.println(priscila);
	}
}
