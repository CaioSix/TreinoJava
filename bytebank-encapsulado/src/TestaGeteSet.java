
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta contaDoCaio = new Conta(1337, 15795);
		contaDoCaio.setNumero(1334);
		System.out.println(contaDoCaio.getNumero());
		
		
		Cliente Caio = new Cliente();
		//conta.titular = Caio;
		contaDoCaio.setTitular(Caio);
		
		Caio.setNome("Caio Cavalcanti");
		System.out.println(contaDoCaio.getTitular().getNome());
		
		contaDoCaio.getTitular().setProfissao("programador");
		
		System.out.println(contaDoCaio.getTitular().getProfissao());
		
	}
}
