package exercicio2;

public class Student {
  String name;
  int letterNumber;

  public Student(String name, int letterNumber) {
    this.name = name;
    this.letterNumber = letterNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLetterNumber() {
    return letterNumber;
  }

  public void setLetterNumber(int letterNumber) {
    this.letterNumber = letterNumber;
  }

}
