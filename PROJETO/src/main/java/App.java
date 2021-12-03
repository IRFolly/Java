import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int i=0,idade;
        String nome,cpf,email,armaMagia,nomeJ;
        Scanner input = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador auxJ;
        Mago auxM;
        Guerreiro auxG;
        Arquivo arquivo = new Arquivo();


        jogadores= arquivo.ler();

        Mago p1 = new Mago("Valdor","bola de fogo");
        Guerreiro p2 = new Guerreiro("Luzon","adaga");
        Guerreiro p3 = new Guerreiro("Valkyr","Espada");

        //j1.novoPersonagem(p1);
        //j1.novoPersonagem(p2);
        System.out.println(jogadores.size());
        //jogadores.add(j1);
        //jogadores.add(j2);

        for (Jogador j:jogadores){
            //System.out.println(j.getNome()+" / "+jogadores.get(i).getNome());
            if(j.getNome()=="Helena"){
                jogadores.get(i).novoPersonagem(p3);
            }
            i++;
        }

        //chamada do menu de opçoes

        System.out.println("Menu Principal");
        System.out.println("1- Jogadores / 2- Criar Personagem / 3- Mostrar Personagens / 4- Açao Personagem");
        System.out.println("-------------------------------------------------------------------------------------");
        int acao =input.nextInt();

        do{
            if(acao==1) {
                System.out.println("1- Adicionar Jogador / 2- Remover Jogador / 3- Atualizar Dados / 4- Mostrar Jogadores");
                int acaoAux =input.nextInt();

                if(acaoAux==1){
                    System.out.println("Qual o nome do novo jogador?");
                    input.nextLine();
                    nome = input.nextLine();
                    System.out.println("cpf");
                    cpf = input.nextLine();
                    System.out.println("idade");
                    idade = input.nextInt();
                    System.out.println("email");
                    input.nextLine();
                    email = input.nextLine();
                    auxJ = new Jogador(nome, cpf, idade, email);
                    jogadores.add(auxJ);
                    arquivo.escrever(auxJ);
                }
                if(acaoAux==2){
                    i=0;
                    for (Jogador j : jogadores) {
                        System.out.println(i+"- "+j.getNome());
                        i++;
                    }
                    System.out.println("Selecione o numero do jogador a remover");
                    i=input.nextInt();
                    jogadores.remove(i);
                }
                if(acaoAux==3){
                    i=0;
                    for (Jogador j : jogadores) {
                        System.out.println(i+"- "+j.getNome());
                        i++;
                    }
                    System.out.println("Selecione o numero do jogador a atualizar");
                    i=input.nextInt();
                    System.out.println("Qual o novo nome do jogador?");
                    input.nextLine();
                    nome = input.nextLine();
                    System.out.println("cpf");
                    cpf = input.nextLine();
                    System.out.println("idade");
                    idade = input.nextInt();
                    System.out.println("email");
                    input.nextLine();
                    email = input.nextLine();

                    jogadores.get(i).setCpf(cpf);
                    jogadores.get(i).setNome(nome);
                    jogadores.get(i).setIdade(idade);
                    jogadores.get(i).setEmail(email);

                }
                if(acaoAux==4){
                    for (Jogador j : jogadores) {
                        System.out.println(j.getNome()+" / "+j.getIdade()+" anos /  contato: "+j.getEmail());
                    }
                }

            }
            if(acao==2) {
                i=0;
                System.out.println("De qual jogador será esse personagem?");
                input.nextLine();
                nomeJ = input.nextLine();
                System.out.println("nome");
                nome = input.nextLine();
                System.out.println("Guerreiro(1) ou Mago(2)?");
                i = input.nextInt();
                System.out.println(i);
                input.nextLine();
                if(i==1){
                    i=0;
                    System.out.println("Qual a arma do guerreiro?");
                    armaMagia = input.nextLine();
                    auxG= new Guerreiro(nome,armaMagia);
                    for (Jogador j:jogadores){
                        //System.out.println(j.getNome()+" / "+jogadores.get(i).getNome());
                        if(j.getNome().equals(nomeJ)){
                            jogadores.get(i).novoPersonagem(auxG);
                        }
                        i++;
                    }
                }else{
                    i=0;
                    System.out.println("Qual a magia do Mago?");
                    armaMagia = input.nextLine();
                    auxM = new Mago(nome,armaMagia);
                    for (Jogador j:jogadores){
                        if(j.getNome().equals(nomeJ)){
                            jogadores.get(i).novoPersonagem(auxM);
                        }
                        i++;
                    }
                }
            }
            if(acao==3) {
                i = 0;
                for (Jogador j : jogadores) {
                    System.out.println("====" + jogadores.get(i).getNome() + "====");
                    jogadores.get(i).mostrarPersonagens();
                    i++;
                }
            }
            if(acao==4) {
                System.out.println("1-atacar / 2-subir de nível/ 3-dano /4-curar");
                acao = input.nextInt();
                for (Jogador j : jogadores) {
                    for (Personagem p : j.selecionarPersonagem()) {
                        if (acao == 1) {
                            p.atacar();
                        }
                        if (acao == 2) {
                            p.aumentarNivel();
                        }
                        if (acao == 3) {
                            p.tomarDano(100);
                        }
                        if (acao == 4) {
                            p.recuperarVida();
                        }
                    }
                }
            }

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Menu Principal");
            System.out.println("1- Jogadores / 2- Criar Personagem / 3- Mostrar Personagens / 4- Açao Personagem");
            System.out.println("-------------------------------------------------------------------------------------");
            acao = input.nextInt();
        }while(acao<5 && acao>0);







    }
}
