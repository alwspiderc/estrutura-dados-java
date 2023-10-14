package desafio;

public class LinkedList implements InterfaceList {

  private Node first;
  private Node last;
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  @Override
  public void add(Integer data) {
    Node node = new Node(data);

    if (isEmpty()) {
      this.first = node;
      this.last = node;
    } else {
      this.last.setNext(node);
    }

    this.last = node;
    this.size++;
  }

  @Override
  public void removeFirstElement() {
    this.first.setNext(this.first.getNext());
    this.first = this.first.getNext();
    this.size--;
  }

  @Override
  public void removeLastElement() {
    Node penultimate = get(this.size - 2);
    penultimate.setNext(null);
    this.last = penultimate;
    this.size--;
  }

  @Override
  public void removeAnyElement(int position) {
    if (isEmpty()) {
      throw new IllegalStateException("Lista vazia!");
    }

    if (position > getSize() - 1 || position < 0) {
      throw new IllegalArgumentException("Posicão inválida!");
    }

    if (getSize() == 1) {
      this.first = null;
      this.last = null;
      this.size--;
      return;
    }

    if (position == 0) {
      removeFirstElement();
      return;
    }

    if (position == getSize() - 1) {
      removeLastElement();
      return;
    }

    Node previous = get(position - 1);
    Node next = get(position + 1);
    previous.setNext(next);
    this.size--;
  }

  @Override
  public Node get(int position) {
    if (position < 0 || position >= size) {
      throw new IllegalArgumentException("Posição inválida!");
    }

    Node current = this.first;
    for (int i = 0; i < position; i++) {
      if (current.getNext() != null) {
        current = current.getNext();
      }
    }

    return current;
  }

  @Override
  public boolean isEmpty() {
    return this.getSize() == 0;
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
  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "LinkedList [first=" + first + ", last=" + last + ", size=" + size +
        "]";
  }

}
