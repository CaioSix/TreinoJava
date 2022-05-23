
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24336);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 15672);
		Conta conta3 = new Conta(1337, 19486);
		
		System.out.println(Conta.getTotal());
	}
}
