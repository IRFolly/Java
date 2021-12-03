public class Personagem {
    static int total_personagens;
    protected int id;
    protected String nome;
    protected int vida;
    protected int level;
    protected int max_vida;
    protected int ouro;

    public Personagem() {
    }

    void atacar(){

    }

    void recuperarVida(){
        vida=vida+10;
        if(vida>max_vida) vida=max_vida;
        System.out.println(nome+" está com "+vida+" de vida");
    }

    void tomarDano(int dano){
        vida=vida-dano;
        if (vida<0) vida=0;
        if(vida==0){
            System.out.println(nome+" tomou dano demais, use uma poção para revive-lo");
        }else {
            System.out.println(nome + " tomou " + dano + " de dano e está com " + vida + " de vida");
        }
    }
    void aumentarNivel(){
        level++;
        max_vida=max_vida*level;
        vida=max_vida;
        System.out.println("Parabéns, "+nome+" foi para o nível "+level);
    }

    void addOuro(int ouro){
        this.ouro = this.ouro + ouro;
    }
    void gastarOuro(int ouro){
        this.ouro=this.ouro-ouro;
    }

    public static int getTotal_personagens() {
        return total_personagens;
    }
    public int getMax_vida() {
        return max_vida;
    }
    public  int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public int getLevel() {
        return level;
    }
    public int getOuro() {
        return ouro;
    }

}
