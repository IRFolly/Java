import java.util.Scanner;

public class Jogador {
    String nome;
    String email;
    Personagem[] personagens = new Personagem[20];

    void mostrarInfo(){
        System.out.println("Jogador:"+nome);
        System.out.println("email:"+email);
        if(personagens[0]!=null){
            for (int i = 0; i <personagens.length ; i++) {
                if(personagens[i]!=null){
                    personagens[i].mostrarInfo();
                }
            }
        }else{
            System.out.println("--Nenhum personagem cadastrado--");
        }

    }

    void adicionarPersonagem(Personagem personagem){
        int auxPersonagem = 0;

        while (personagens[auxPersonagem]!=null){
            auxPersonagem++;
        }
        personagens[auxPersonagem] = personagem;
    }

    int calculaMagia(){
        int auxMagia=0;
        if(personagens[0]!=null){
            for (int i = 0; i <personagens.length ; i++) {
                if(personagens[i]!=null){
                    if(personagens[i].usaMagia){
                        auxMagia++;
                    }
                }
            }
        }
        return auxMagia;
    }

    void mostrarMediaNivel(){
        int auxMedia=0;
        int auxQuant=0;

        if(personagens[0]!=null){
            for (int i = 0; i <personagens.length ; i++) {
                if(personagens[i]!=null){
                    auxMedia += personagens[i].nivel;
                    auxQuant++;
                }
            }
            System.out.println("A média do nível dos personagens é "+(auxMedia/auxQuant));
        }else{
            System.out.println("--Nenhum personagem cadastrado--");
        }



    }
}
