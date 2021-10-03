public class App {
    public static void main(String[] args) {

        //Declaração dos objetos
        Material m1;
        Material m2;
        Material m3;
        Material m4;

        //Instancia dos objetos
        m1 = new Material();
        m2 = new Material();
        m3 = new Material();
        m4 = new Material();

        //Definindo valores
        m1.cod_serie = 1001;
        m1.cod_material = 9;
        m1.categoria = "Interior";
        m1.nome = "Volante";
        m1.quantidade = 200;

        m2.cod_serie = 1010;
        m2.cod_material = 10;
        m2.categoria = "Interior";
        m2.nome = "Banco";
        m2.quantidade = 35;

        m3.cod_serie = 11001;
        m3.cod_material = 25;
        m3.categoria = "Exterior";
        m3.nome = "Roda";
        m3.quantidade = 400;

        m4.cod_serie = 11;
        m4.cod_material = 3;
        m4.categoria = "Interior";
        m4.nome = "Porta-Copo";
        m4.quantidade = 42;


        //Exibição dos materiais disponiveis
        System.out.println("Os materiais disponiveis em estoque sao:");
        m1.mostrarInformacoes();
        m2.mostrarInformacoes();
        m3.mostrarInformacoes();
        m4.mostrarInformacoes();
    }
}
