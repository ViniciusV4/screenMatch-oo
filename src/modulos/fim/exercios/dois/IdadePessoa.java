package modulos.fim.exercios.dois;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (getIdade() >= 18) {
            System.out.println(nome() + " é maior de idade.");
        } else {
            System.out.println(nome() + " é menor de idade.");
        }
    }
}
