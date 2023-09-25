package lista;

public class ListaEncadeada<T> {
    
    private No<T> inicio;
    private No<T> atual;
    private No<T> ultimo;
    private int tamanho;
    

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        }else {
            ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;        
    }

    public boolean temProximo() {
        if(inicio == null) {
            return false;
        }
        
        if (atual == null) {
            atual = inicio;
            return true;
        } 
        
        boolean temProximo = atual.getProximo() != null ? true : false;
        atual = atual.getProximo();
        return temProximo;
        
    }

    public void remover() {
        if(inicio.getProximo() != null ) {
            No celula = this.recuperarPenultimo(inicio);
            ultimo = celula;
            celula.setProximo(null);
        } else {
            inicio = ultimo = null;
        }

    }

    private No recuperarPenultimo(No celula) {

		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getAtual() {
        return atual;
    }

    public void setAtual(No<T> atual) {
        this.atual = atual;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    

    // @Override
    // public String toString() {
    //     return "ListaEncadeada [inicio=" + inicio + "]";
    // }
}
