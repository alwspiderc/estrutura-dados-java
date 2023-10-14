package exercicio2;

public class ListTest {
  public static void main(String[] args) {
    List list = new List();

    Student student1 = new Student("bola", transformLetterToNumber("bola".substring(0, 1)));
    Student student2 = new Student("abelha", transformLetterToNumber("abelha".substring(0, 1)));
    Student student3 = new Student("duvido", transformLetterToNumber("duvido".substring(0, 1)));
    Student student4 = new Student("coco", transformLetterToNumber("coco".substring(0, 1)));

    list.add(student1);
    list.add(student2);
    list.add(student3);
    list.add(student4);

    System.out.println(list.list());

    // System.out.println("\n-------------------------------------------------------------------\n");
    // Student student1 = new Student("Estudante 1");
    // Student student2 = new Student("Estudante 2");
    // list.add(student1);
    // list.add(student2);

    // Node position1 = list.positionSearch(1);
    // System.out.println("Posição pesquisada: " + position1);
    // System.out.println(list.list());
    // System.out.println("\n-------------------------------------------------------------------\n");
    // list.remove();
    // System.out.println(list.list());

  }

  public static int transformLetterToNumber(String letter) {
    String letterLower = letter.toLowerCase().trim();

    switch (letterLower) {
      case "a":
        return 1;
      case "b":
        return 2;
      case "c":
        return 3;
      case "d":
        return 4;
      case "e":
        return 5;
      case "f":
        return 6;
      case "g":
        return 7;
      case "h":
        return 8;
      case "i":
        return 9;
      case "j":
        return 10;
      case "k":
        return 11;
      case "l":
        return 12;
      case "m":
        return 13;
      case "n":
        return 14;
      case "o":
        return 15;
      case "p":
        return 16;
      case "q":
        return 17;
      case "r":
        return 18;
      case "s":
        return 19;
      case "t":
        return 20;
      case "u":
        return 21;
      case "v":
        return 22;
      case "w":
        return 23;
      case "x":
        return 24;
      case "y":
        return 25;
      case "z":
        return 26;
      default:
        throw new IllegalArgumentException("Letra inválida!");
    }

  }
}
