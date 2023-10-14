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

public interface interfaceList {

  public void add(Teacher data);

  public void remove(Teacher data);

  public int getSize();

  public boolean isEmpty();

  public void clearAll();

  public Node positionSearch(int position);

  public String toString();
}
