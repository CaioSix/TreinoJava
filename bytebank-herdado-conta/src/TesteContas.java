
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente CC = new ContaCorrente(11, 123456);
		CC.deposita(100.0);
		
		ContaPoupanca CP = new ContaPoupanca(11, 321654);
		CP.deposita(200.0);
		System.out.println(CP.getSaldo());
		
		CC.transfere(10.0, CP);
		System.out.println("CC: " + CC.getSaldo());
		System.out.println("CP: " + CP.getSaldo());
	}
}
