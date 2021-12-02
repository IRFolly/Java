public class Personagem {
    static int total_personagens;
    protected int id;
    protected String nome;
    protected int vida;
    protected int level;
    protected int max_vida;
    protected int ouro;
    protected Jogador jogador;

    public Personagem() {
    }

    void recuperarVida(){
        vida=vida+10;
        if(vida>max_vida) vida=max_vida;
    }

    void tomarDano(int dano){
        vida=vida-dano;
        if (vida<0) vida=0;
    }
    void aumentarNivel(){
        level++;
        max_vida=max_vida*level;
        vida=max_vida;
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
    public Jogador getJogador() {
        return jogador;
    }

}
