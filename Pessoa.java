package BANCO;

public class Pessoa {
     private String nome;
     private String cpf;
     private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "(" + "nome" + "\t" + "Cpf" + "\t" + "Email" + "\n" + "\t" + getNome() + "\t" + getCpf() + "\t" + getEmail() + ")";
    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;


    }
}
