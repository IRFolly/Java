public class Jogador {
    private String nome;
    private String cpf;
    private int idade;
    private String email;

    public Jogador(String nome, String cpf, int idade, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
    }

    //setter de cpf e idade nao foram definidos pois assume-se que sao informaçõe sque nao ´pdem ser alteradas

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
