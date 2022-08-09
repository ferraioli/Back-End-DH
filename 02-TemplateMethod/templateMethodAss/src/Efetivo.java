public class Efetivo extends Empregado{
        private double salarioBase;

    public Efetivo(String nome, String sobrenome, String vinculo, String numeroConta, double salarioBase) {
        super(nome, sobrenome, vinculo, numeroConta);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void pagarSalario(){
        calcularSalario();
        imprimir();
        depositar();
    }

    @Override
    public void calcularSalario() {
       double salario = salarioBase- (salarioBase * 0.06);
        System.out.println(salario);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo um recibo em papel...");
    }

    @Override
    public void depositar() {
        System.out.println( "Depositando na conta: " + this.getNumeroConta());
    }
}
