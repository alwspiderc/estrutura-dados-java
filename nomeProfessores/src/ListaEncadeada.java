public class ListaEncadeada {

    private Nodo inicio;
    private Nodo atual;
    private Nodo fim;

    public Nodo getInicio() {
        return inicio;
    }
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public Nodo getAtual() {
        return atual;
    }
    public void setAtual(Nodo atual) {
        this.atual = atual;
    }
    public Nodo getFim() {
        return fim;
    }
    public void setFim(Nodo fim) {
        this.fim = fim;
    }

    public void add(Professor valor){
        Nodo nodo = new Nodo();
        nodo.setValor(valor);
        
        if(inicio == null && fim == null) {
            inicio = nodo;
            fim = nodo;
        } else {
            fim.setProximo(nodo);
            fim = nodo;
        }
    }

    public void remover() {
        
    }
}
