package teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
  public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada();

    lista.adiciona(0);
    lista.adiciona(1);
    lista.adiciona(2);
    lista.adiciona(3);
    System.out.println(lista);
    lista.limpa();
    System.out.println(lista);
  }
}
