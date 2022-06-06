
// contato Autenticavel
	// quem assinar esse contrato, 
	//precisa implememntar os metodos que sao abstratos

public abstract interface Autenticavel {


	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);
}
