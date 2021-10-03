public class Material {

    int cod_serie;
    int cod_material;
    String nome;
    String categoria;
    int quantidade;

    void mostrarInformacoes(){
        System.out.println(nome+" /-n.série:"+cod_serie+" /-codigo:"+cod_material+" /-categoria:"+categoria+" /-quant.:"+quantidade);
    }

}
