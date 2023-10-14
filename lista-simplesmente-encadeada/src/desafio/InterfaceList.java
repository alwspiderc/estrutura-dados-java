package desafio;

public interface InterfaceList {

  public void add(Integer data);

  public void removeFirstElement();

  public void removeLastElement();

  public void removeAnyElement(int position);

  public Node get(int position);

  public int getSize();

  public boolean isEmpty();
}
