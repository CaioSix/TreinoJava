
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Deu certin a entrada no sistema!");
		}else {
			System.out.println("nao vai rolar entrar no sistema");
		}
	}
}
