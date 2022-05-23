
public class testaBanco {
	public static void main(String[] args) {
		Cliente caio = new Cliente();
		caio.nome = "Caio Cavalcanti";
		caio.cpf = "231.312321.312.312";
		caio.profissao = "Programador";
		
		Conta contaDoCaio = new Conta();
		contaDoCaio.deposita(100);
		
		// associa conta ao cliente
		contaDoCaio.titular = caio;
		
		System.out.println(contaDoCaio.titular.nome);
		
		Conta contaDaLorrana = new Conta();
		contaDaLorrana.titular = new Cliente();
		contaDaLorrana.titular.nome = "lorraan";
		contaDaLorrana.deposita(500);
		
		System.out.println("saldo da conta do caio" + contaDoCaio.getSaldo());
		//System.out.println(contaDaLorrana.saldo);
		contaDaLorrana.transfere(300, contaDoCaio);
		System.out.println("saldo da conta do caio" + contaDoCaio.getSaldo());
		
		
	}
}
