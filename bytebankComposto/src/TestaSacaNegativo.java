
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta contaDoCaio = new Conta();
		contaDoCaio.deposita(100);
		contaDoCaio.deposita(200);
		System.out.println(contaDoCaio.pegaSaldo());
		
	}
}
