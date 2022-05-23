
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario caio = new Funcionario();
		caio.setNome("Caio Cavalcanti");
		caio.setCpf("21893021");
		caio.setSalario(2500.89);
		
		System.out.println(caio.getNome());
		System.out.println(caio.getBonificacao());
		
	}
}
