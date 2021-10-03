public class GerenteRegional extends Funcionario implements Reuniao,Venda{

    private String departamento;

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: "+departamento);
    }

    @Override
    public void recebeSalario() {
        System.out.println("O gerente recebeu o salário de R$ "+salario);
    }

    public void promoveFuncionario(){
        System.out.println("Funcionario promovido");
    }

    @Override
    public void agendaReuniao(String motivo) {
        System.out.println("Reunião Cadastrada. Motivo: "+motivo);
    }

    @Override
    public void fechaVenda(double valorVenda) {
        System.out.println("Venda realizada no valor de R$"+valorVenda);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
