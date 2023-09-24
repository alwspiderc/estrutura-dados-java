public class ListaEncadeada {
	// Essa classe vc entendendo tb pode ajudar na resolução de outros exercicios
	// primeiro quais as caractristicas de uma lista encadeada? 
	// inicio, ultimo, proximo e para não perder a referencia de inicio vamos criar um posicaoAtual 
	
							  //	primeiro v  	pa	v
	private Celula primeiro;  //      |       | |--> |       | |-->  |       | |--> null
	private Celula ultimo;//                                                ^ultimo
	private Celula posicaoAtual;

	//falamos em operações com as listas encadeadas? 
	//CONSULTAR, ADICIONAR, EXCLUIR
	
	// vou começar com o metodo adicionar 
	public void adicionar(Contato valor) {
		//vamos precisar criar uma estrutura para armazenar esse valor que vamos adicionar
		Celula celula = new Celula(); //|     | |-->
		celula.setValor(valor);// Felipe --> |Felipe| | -->
		//mas antes pegar  |Felipe| | --> e adicionar vamos precisar verificar como anda a nossa lista
		if(primeiro == null && ultimo == null) {// isso significa que a lista esta vaziaaa
			//se esta vazia.. |Felipe| | --> vai ser o primeiro da lista
			primeiro = celula;//|Felipe| | -->
			ultimo = celula;
		}else {//significa que a minha lista não esta vazia
												// ultimo v
			ultimo.setProximo(celula);// |alguem| |-->|Felipe| | -->null
			ultimo = celula;	
		}
	}
	
	public boolean temProximo() {
		if (primeiro == null) { //lista vazia e lista vazia n tem proximo
			return false;
		} else if(posicaoAtual==null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() !=null ? true: false;
			/*
			 * if(posicaoAtual.getProximo() != null){
			 * 		return true;
			 * else
			 * 		return false;
			 * */
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	
	}
	
	//vamos fazer uma remoção do ultimo
	public void remover() {
		//como esta a nossa lista
		if(primeiro.getProximo()!= null) {// moralll essa lista tem contato
			Celula celula = this.recuperarPenultimo(primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}

	public Celula getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}

	public Celula getUltimo() {
		return ultimo;
	}

	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
	
	
}