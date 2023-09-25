package lista.teste;

public class Livro {
    private int id;
    private String nome;
    private int ano;
    
    
    public Livro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
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
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
      
}
