public class App {
    public static void main(String[] args) {
        Pessoa p1;
        Pessoa p2
                ;
        Endereco e1;
        Endereco e2;
        Endereco e3;
        Endereco e4;
        Endereco e5;
        Endereco e6;
        Endereco e7;

        p1 = new Pessoa("Iuri",111111,5);

        e1 = new Endereco("Um","Aero",151);
        e2 = new Endereco("Dois","Aero",152);
        e3 = new Endereco("Tres","Aero",153);
        e4 = new Endereco("Quatro","Aero",154);

        p1.addEndereco(e1);
        p1.addEndereco(e2);
        p1.addEndereco(e3);
        p1.addEndereco(e4);


        p2 = new Pessoa("Maria",222222,2);

        e5 = new Endereco("Cinco","Aero",155);
        e6 = new Endereco("Seis","Aero",156);
        e7 = new Endereco("Sete","Aero",157);

        p2.addEndereco(e5);
        p2.addEndereco(e6);
        p2.addEndereco(e7);

        p1.mostraInfo();
        p2.mostraInfo();

    }
}
