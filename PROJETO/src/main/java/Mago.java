public class Mago extends Personagem{
    private int spell_slot;
    private String magia;

    public Mago(String nome,String magia) {
        this.nome = nome;
        vida=50;
        max_vida=50;
        level=1;
        id=++total_personagens;
        ouro=25;
        this.magia=magia;
        spell_slot=3;
    }

    @Override
    void atacar(){
        if(spell_slot>0){
            System.out.println(nome+" lancou uma "+magia+"!!");
            if(spell_slot==1){
                System.out.println(nome+" nao pode mais lançar feitiços!!!");
                --spell_slot;
            }else {
                System.out.println(nome + " ainda pode lançar " + (--spell_slot) + " feitiços!!!");
            }
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
