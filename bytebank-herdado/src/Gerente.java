// Genrente ? um Funcionario. 
//          Gerente Herda class de funcionario e assina um contrato Autenticavel
public class Gerente extends  Funcionario  implements Autenticavel{

	private int senha ;
	private AutenticacaoUtil autentificador;
	
	public Gerente() {
		this.autentificador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando metodo do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
		 
	}


}
