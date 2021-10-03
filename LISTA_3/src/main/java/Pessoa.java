public class Pessoa {
    private String nome;
    private int cpf;
    private Endereco endereco[];

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        endereco = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        boolean cadastrado=false;
        int i=0;

        do {
            if(endereco[i]==null){
                endereco[i]=end;
                cadastrado=!cadastrado;
                //System.out.println("Cadastrado com sucesso");
            }
            i++;
        }while(i<endereco.length && !cadastrado);

        if(i>endereco.length){
            System.out.println("O numero máximo de endereços foi excedido");
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereco:");
        for (int i = 0; i <endereco.length ; i++) {
            //System.out.println("1-"+i);

            if(endereco[i]!=null){
                System.out.println("-Bairro:"+endereco[i].getBairro()+"; Rua:"+endereco[i].getRua()+"; Numero:"+endereco[i].getNum());
            }
            //System.out.println("2-"+i);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }
}
