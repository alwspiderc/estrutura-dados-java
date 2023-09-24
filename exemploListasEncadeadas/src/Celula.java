public class Celula { // cada |     | | --> |     | |--> null
	//dentro de cada estrutura de celula temos valor e o proximo que é tipo de uma celula
	private Contato valor; // valor dentro de cada celula
	private Celula proximo; // vai ter a informação de qual celula vem em seguida
	
	public Contato getValor() {
		return valor;
	}
	public void setValor(Contato valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
	
}