package lista;
/*
  - [x] Definição;
  - [x] Criação da classe Nó e ListaEncadeada;
  - [x] Inserir no início;
  - [x] Quantidade de nós (tamanho);
  - [x] Inserir no final da lista;
  - [x] Percorrer a lista (imprimir);
  - [x] Limpar a lista;
  - [] Pesquisar um nó ou uma posição específica;
  - [] Inserir em posição específica;
  - [] Remover do início;
  - [] Remover do final da lista;
  - [] Remover de qualquer posição;
  - [] Inserir de forma ondernada;
  - [] API java LinkedList;
  - [] Exercícios;
 */

public class ListaEncadeada {

  private No inicio;
  private No ultimo;
  private Integer tamanho = 0;

  public void adiciona(Integer elemento) {
    No no = new No(elemento);
    if (this.tamanho == 0) {
      this.inicio = no;
    } else {
      this.ultimo.setProximo(no);
    }

    this.ultimo = no;
    this.tamanho++;
  }

  public void limpa() {

    for (No atual = this.inicio; atual != null;) {
      No proximo = atual.getProximo();
      atual.setElemento(null);
      atual.setProximo(null);
      atual = proximo;
    }

    this.inicio = null;
    this.ultimo = null;
    this.tamanho = 0;

  }

  public No getInicio() {
    return inicio;
  }

  public No getUltimo() {
    return ultimo;
  }

  public Integer getTamanho() {
    return tamanho;
  }

  @Override
  public String toString() {

    if (this.tamanho == 0) {
      return "[]";
    }

    No atual = this.inicio;
    String lista = "[";

    for (Integer i = 0; i < this.tamanho; i++) {
      lista = lista + atual.getElemento() + (i < this.tamanho - 1 ? ", " : "");
      atual = atual.getProximo();
    }

    return lista + "]";
  }

}
