public class Mago extends Personagem{
    private int spell_slot;
    private String magia;

    public Mago(String nome,String magia, Jogador jogador) {
        this.nome = nome;
        vida=50;
        max_vida=50;
        level=1;
        id=++total_personagens;
        this.jogador=jogador;
        ouro=25;
    }

    void lancarMagia(){
        if(spell_slot>0){
            System.out.println(nome+" lancou uma "+magia+"!!");
        }
        else System.out.println("Ah não, "+nome+" está sem spell slots!!");
    }

    public int getSpell_slot() {
        return spell_slot;
    }

    public String getMagia() {
        return magia;
    }



}
