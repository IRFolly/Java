public class Guerreiro extends Personagem{
    private String arma;


    public Guerreiro(String nome,String arma,Jogador jogador) {
        this.arma = arma;
        this.nome = nome;
        vida=200;
        max_vida=200;
        level=1;
        id=++total_personagens;
        this.jogador=jogador;
        ouro=20;
    }

    void atacar(){
        System.out.println(nome+" atacou com seu "+arma);
    }

    public String getArma() {
        return arma;
    }

}
