package exercicio2;

public class Node {
  private Student data;
  private Node next;

  public Node(Student data) {
    this.data = data;
    this.next = null;
  }

  public Node(Student data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Student getData() {
    return data;
  }

  public void setData(Student data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "[" + data.name + "]";
  }

}
