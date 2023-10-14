package exercicio1;

public class ListTest {
  public static void main(String[] args) {
    List list = new List();

    System.out.println("\n------------------------------");
    System.out.println("A lista está vazia? " + list.isEmpty());
    addTeachers(list);
    System.out.println(list);
    System.out.println("Tamanho da lista: " + list.getSize());

    System.out.println("\n------------------------------");
    System.out.println("Removendo o ultimo elementos: ");
    list.remove();
    System.out.println(list);
    System.out.println("Tamanho da lista: " + list.getSize());

    System.out.println("A lista está vazia? " + list.isEmpty());

    // System.out.println("\n------------------------------");
    // System.out.println("Removendo todos os elementos: ");
    // list.clearAll();
    // System.out.println(list);
    // System.out.println("Tamanho da lista: " + list.getSize());
  }

  public static void addTeachers(List list) {
    Teacher teacher1 = new Teacher("Professora 1");
    Teacher teacher2 = new Teacher("Professora 2");
    Teacher teacher3 = new Teacher("Professora 3");
    Teacher teacher4 = new Teacher("Professora 4");
    Teacher teacher5 = new Teacher("Professora 5");
    Teacher teacher6 = new Teacher("Professora 6");
    Teacher teacher7 = new Teacher("Professora 7");
    Teacher teacher8 = new Teacher("Professora 8");
    list.add(teacher1);
    list.add(teacher2);
    list.add(teacher3);
    list.add(teacher4);
    list.add(teacher5);
    list.add(teacher6);
    list.add(teacher7);
    list.add(teacher8);
  }
}
