public class Contador extends Funcionario implements Despesa{

    private int ramal;

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Ramal: "+ramal);
    }

    @Override
    public void recebeSalario() {
        System.out.println("O contador recebeu o salário de R$ "+salario);
    }

    @Override
    public void cadastraDespesa(String despesa) {
        System.out.println("A despesa "+despesa+" foi cadastrada");
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
