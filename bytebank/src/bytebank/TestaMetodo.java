package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaPriscila = new Conta();
		contaDaPriscila.saldo = 100;
		
		contaDaPriscila.deposita(50);
		System.out.println(contaDaPriscila.saldo);
		
		contaDaPriscila.saca(20);
		System.out.println(contaDaPriscila.saldo);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(1000);
		
		if(contaDoJoao.transfere(300, contaDaPriscila)) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDoJoao.saldo);
		System.out.println(contaDaPriscila.saldo);
		
		contaDaPriscila.titular = "priscila rossetto";
		System.out.println(contaDaPriscila.titular);
	}
}
