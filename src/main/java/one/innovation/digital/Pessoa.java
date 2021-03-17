package one.innovation.digital;

public class Pessoa {
    private String nome, sobrenome;

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
