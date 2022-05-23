
public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("chamando a bonificacao do editor");
		return super.getBonificacao() + 100;
	}
}
