import java.util.ArrayList;

public class Jogador {
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    public ArrayList<Personagem> personagens = new ArrayList<>();

    public Jogador(String nome, String cpf, int idade, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
    }

    void novoPersonagem(Personagem p){
        personagens.add(p);
    }

    void mostrarPersonagens(){
        for(Personagem p:personagens){
            System.out.println("Nome: "+p.getNome());
            if(p instanceof Mago){
                System.out.println("Classe: Mago");
                System.out.println("Feitico: "+((Mago) p).getMagia());
            }
            if(p instanceof Guerreiro){
                System.out.println("Classe: Guerreiro");
                System.out.println("Feitico: "+((Guerreiro) p).getArma());
            }
            System.out.println("Level: "+p.getLevel());
            System.out.println("Vida: "+p.getVida()+"/"+p.getMax_vida());
            System.out.println("Ouro: "+p.ouro);
            System.out.println("------------------------");
        }
    }


    public String getNome() {
        return nome;
    }
    public ArrayList<Personagem> selecionarPersonagem() {
        return personagens;
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
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
