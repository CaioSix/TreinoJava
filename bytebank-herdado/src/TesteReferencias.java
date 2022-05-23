
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setSalario(2500.0);
		
		ControleBonificacao Controle = new ControleBonificacao();
		Controle.registra(g1);
		Controle.registra(f1);
		Controle.registra(e1);
		
		System.out.println(Controle.getSoma());
		
	}
}
