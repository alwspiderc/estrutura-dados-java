package exercicio1;

import java.util.UUID;

public class Teacher {

  private UUID id;
  private String name;

  public Teacher(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
