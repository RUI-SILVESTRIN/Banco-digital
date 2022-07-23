
public interface IConta {
	//é uma classe que todos tem que usar. como se fosse um contrato
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
