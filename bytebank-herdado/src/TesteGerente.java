
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Caio Cavalcanti");
		g1.setCpf("121");
		g1.setSalario(5000.0);
		g1.setSenha(25);
		
		Gerente gerente = new Gerente();
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.autentica(25));
		System.out.println(g1.getSalario());

		System.out.println(g1.getBonificacao());
		
	}
}
