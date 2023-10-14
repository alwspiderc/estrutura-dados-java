package exercicio2;

/**
 * 2 – Crie um programa em java para realizar matrícula de alunos no curso de
 * análise. Deverá ser apresentada as seguintes funcionalidades:
 * [x] a) Adicionar
 * [x] b) Remover
 * [x] c) Pesquisar
 * [x] d) Listar
 * [x] e) Colocar a lista em ordem alfabética
 */

public class List {

  private Node first;
  private Node last;
  private int size = 0;

  // [x] a) Adicionar
  // [x] e) Colocar a lista em ordem alfabética
  public void add(Student data) {
    Node node = new Node(data);

    if (this.size == 0) {
      this.first = node;
      this.last = node;
    } else {
      Node current = this.first;
      Node previous = null;

      while (current != null && node.getData().getLetterNumber() > current.getData().getLetterNumber()) {
        previous = current;
        current = current.getNext();
      }

      if (previous == null) {
        node.setNext(this.first);
        this.first = node;
      } else {
        previous.setNext(node);
        node.setNext(current);

        if (current == null) {
          this.last = node;
        }
      }
    }

    this.size++;

  }

  // [x] b) Remover
  public void remove() {
    if (size == 0) {
      throw new IllegalStateException("A lista está vazia");
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

  // [x] c) Pesquisar
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

  // [x] d) Listar
  public String list() {
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

  // public void sortAlphabetically() {
  // // Se o número for menor que o numero posterior então o elemento ficará em
  // // primeira posição, caso contrário ficará na ultima posição.

  // Node current = first;

  // for (int i = 0; i < getSize(); i++) {

  // if (current.getNext() != null) {
  // current = current.getNext();
  // System.out.println(current.getData().getName());
  // }
  // }
  // }

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

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

}
