
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		contaDaMarcela.deposita(20);
		System.out.println("a conta da marcela possui " + contaDaMarcela.getSaldo());
	}
}
