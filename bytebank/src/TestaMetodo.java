
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoCaio = new Conta();
		contaDoCaio.saldo = 100;
		contaDoCaio.deposita(50);
		
		System.out.println("valor da conta " + contaDoCaio.saldo);
		
		contaDoCaio.saca(20);
		System.out.println("valor da conta " + contaDoCaio.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoCaio ); 
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoCaio.saldo);
		
		contaDoCaio.titular = "Caio Cavalcanti";
		
		System.out.println(contaDoCaio.titular);
	}
}
