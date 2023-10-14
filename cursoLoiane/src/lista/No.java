package lista;

public class No {

  private Integer elemento;
  private No proximo;

  public No(Integer elemento) {
    this.elemento = elemento;
    this.proximo = null;
  }

  public No(Integer elemento, No proximo) {
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public int getElemento() {
    return elemento;
  }

  public void setElemento(Integer elemento) {
    this.elemento = elemento;
  }

  public No getProximo() {
    return proximo;
  }

  public void setProximo(No proximo) {
    this.proximo = proximo;
  }

  @Override
  public String toString() {
    return "No: [elemento=" + elemento + ", proximo=" + proximo + "]";
  }

}
