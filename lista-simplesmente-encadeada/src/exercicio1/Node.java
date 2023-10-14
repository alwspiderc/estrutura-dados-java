package exercicio1;

/**
 * Node
 */
public class Node {

  public Teacher data;
  public Node next;

  public Teacher getData() {
    return data;
  }

  public void setData(Teacher data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

}