public class Vendedor extends Funcionario implements Venda{

    private double totalComissao=0;

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Comissão: R$ "+totalComissao);
    }

    @Override
    public void recebeSalario() {
        System.out.println("O vendedor recebeu o salário de R$ "+salario);
    }

    @Override
    public void fechaVenda(double valorVenda) {
        System.out.println("Venda realizada no valor de R$"+valorVenda);
        totalComissao += valorVenda*0.2;
    }

    public double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }
}
