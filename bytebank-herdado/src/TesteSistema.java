
public class TesteSistema {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cli = new Cliente();
		cli.setSenha(25);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cli);
		
	}
}