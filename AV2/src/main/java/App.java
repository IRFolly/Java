public class App {
    public static void main(String[] args) {

        Funcionario[] funcionario = new Funcionario[5];

        GerenteRegional g1 = new GerenteRegional();
        GerenteRegional g2 = new GerenteRegional();
        Vendedor v1 = new Vendedor();
        Contador c1 = new Contador();

        g1.setNome("Iuri");
        g1.setSalario(1000);
        g1.setDepartamento("Departamento A");

        g2.setNome("Maria");
        g2.setSalario(900);
        g2.setDepartamento("Departamento B");

        v1.setNome("Aline");
        v1.setSalario(500);

        c1.setNome("Pedro");
        c1.setSalario(400);
        c1.setRamal(1234);

        funcionario[0]=g1;
        funcionario[1]=v1;
        funcionario[2]=c1;
        funcionario[3]=g2;

        for(Funcionario func:funcionario){
            if(func!=null){
                if(func instanceof GerenteRegional){
                    func.recebeSalario();
                    ((GerenteRegional) func).promoveFuncionario();
                    ((GerenteRegional) func).agendaReuniao("Fechamento do mes");
                    ((GerenteRegional) func).fechaVenda(func.getMatricula()*100);//comissão baseada na matricula apenas para os 2 gerentes possuirem valores de venda diferentes

                }
                if(func instanceof Vendedor){
                    func.recebeSalario();
                    ((Vendedor) func).fechaVenda(1000);

                }
                if(func instanceof Contador){
                    func.recebeSalario();
                    ((Contador) func).cadastraDespesa("Compras do mes");


                }
                func.mostrarInfo();

            }
            System.out.println("-----------------------------");
        }
        System.out.println("Foram criados um total de "+v1.contador+" funcionarios");
    }
}
