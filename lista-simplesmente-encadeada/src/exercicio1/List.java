package exercicio1;

/**
 * 1 – Crie um programa em java que tenha uma lista com os nomes dos
 * professores do curso de Análise da UCSAL, contemplando as seguintes
 * operações:
 * [x] a) Adicionar
 * [x] b) Remover
 * [x] c) Verificar tamanho
 * [x] d) Verificar se está vazia, retornando true
 * [x] e) Apagar lista, deletando todos os registros
 * [x] f) Listar os registros da lista.
 * 
 */

public class List implements interfaceList {
  private Node first;
  private Node last;
  private int size;

  // [x] a) Adicionar
  public void add(Teacher data) {
    Node node = new Node();
    node.setData(data);
    if (first == null && last == null) {

      first = node;
      last = node;
    } else {

      last.setNext(node);

    }
    last = node;
    size++;
  }

  // --------------------------------------------------------------------------
  // [x] b) Remover ultimo registro da lista
  public void remove() {
    if (size == 0) {
      throw new IllegalStateException("A lista está vazia!");
    }
    if (size == 1) {
      this.first = null;
      this.last = null;
    } else {
      Node penultimate = positionSearch(size - 2);
      penultimate.setNext(null);
      this.last = penultimate;
    }

    this.size--;
  }

  public Node positionSearch(int position) {
    if (position < 0 || position >= this.size) {
      throw new IllegalArgumentException("Posição inválida!");
    }

    Node current = this.first;
    for (int i = 0; i < position; i++) {
      current = current.getNext();
    }

    return current;
  }
  // --------------------------------------------------------------------------

  // [x] c) Verificar tamanho
  public int getSize() {
    return this.size;
  }

  // [x] d) Verificar se está vazia, retornando true
  public boolean isEmpty() {
    if (this.size > 0) {
      return false;
    }
    return true;
  }

  // [x] e) Apagar lista, deletando todos os registros
  public void clearAll() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }

  // [x] f) Listar os registros da lista.
  @Override
  public String toString() {
    if (this.size == 0) {
      return "[]";
    }

    Node current = this.first;
    String list = "[";
    for (int i = 0; i < this.size; i++) {
      list = list + current.getData().getName() + (i < this.size - 1 ? ", " : "");
      current = current.getNext();
    }

    return list + "]";
  }

  public Node getFirst() {
    return first;
  }

  public void setFirst(Node first) {
    this.first = first;
  }

  public Node getLast() {
    return last;
  }

  public void setLast(Node last) {
    this.last = last;
  }

  @Override
  public void remove(Teacher data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

}
