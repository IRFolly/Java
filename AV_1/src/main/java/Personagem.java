public class Personagem {
    String classe;
    String arma;
    int nivel;
    double poder;
    boolean usaMagia;

    void mostrarInfo(){
        String auxMagia="Além disso ele conta com seus poderes mágicos";
        if (!this.usaMagia){
            auxMagia="";
        }
        System.out.println("Esse personagem é um "+classe+" nível "+nivel+" com "+poder+" de poder, sua arma é um "+arma+". "+auxMagia);
    }


}
