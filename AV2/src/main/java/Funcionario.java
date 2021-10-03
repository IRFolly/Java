public abstract class Funcionario {

    public static int contador;
    protected int matricula;
    protected String nome;
    protected double salario;


    public Funcionario() {
        contador++;
        matricula = contador;
    }

    public abstract void recebeSalario();

    public void mostrarInfo(){
        System.out.println("-Dados do Funcionario-");
        System.out.println("Matricula: "+matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Salario: R$ "+salario);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
