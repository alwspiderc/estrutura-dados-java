package lista.teste;

public class Professor {
    private int id;
    private String nome;

    public Professor(String nome) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
 
        this.id = (int)(Math.random() * range) + min;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
