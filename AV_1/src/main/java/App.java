import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Jogador jogador = new Jogador();

        jogador.nome="Iuri Folly";
        jogador.email="iuri.folly@jogo.com.br";

        System.out.println("--1-Adicionar personagem/2-Info Jogador/3-Personagens com Magia/4-Nivel Médio/5-Sair--");
        int menu = input.nextInt();

        do {
            switch (menu){
                case 1:
                    //System.out.println(menu);
                    input.nextLine();
                    Personagem auxP = new Personagem();
                    System.out.println("Entre com a classe");
                    auxP.classe = input.nextLine();
                    System.out.println("Entre com a arma");
                    auxP.arma = input.nextLine();
                    System.out.println("Entre com o nivel");
                    auxP.nivel = input.nextInt();
                    System.out.println("Entre com o poder");
                    auxP.poder = input.nextDouble();
                    System.out.println("O personagem usa magia?");
                    auxP.usaMagia = input.nextBoolean();

                    jogador.adicionarPersonagem(auxP);
                    break;
                case 2:
                    //System.out.println(menu);
                    jogador.mostrarInfo();
                    break;
                case 3:
                    //System.out.println(menu);
                    System.out.println("Personagens com magia: "+jogador.calculaMagia());
                    break;
                case 4:
                    //System.out.println(menu);
                    jogador.mostrarMediaNivel();
                    break;
            }

            System.out.println("--1-Adicionar personagem/ 2-Info Jogador/ 3-Personagens com Magia/ 4-Nivel Médio/ 5-Sair--");
            menu = input.nextInt();
        }while(menu!=5);

        System.out.println("Obrigado por Jogar");
    }
}
