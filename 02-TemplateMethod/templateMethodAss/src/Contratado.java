public class Contratado extends Empregado{
    private int horasTrabalhadasSemana;
    private double precoHora;

    public int getHorasTrabalhadasSemana() {
        return horasTrabalhadasSemana;
    }

    public void setHorasTrabalhadasSemana(int horasTrabalhadasSemana) {
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public Contratado(String nome, String sobrenome, String vinculo,
                      String numeroConta, int horasTrabalhadasSemana, double precoHora) {
        super(nome, sobrenome, vinculo, numeroConta);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
        this.precoHora = precoHora;
    }

    public void pagarSalario(){
        calcularSalario();
        imprimir();
        depositar();
    };

    @Override
    public void calcularSalario() {
        double salario = (horasTrabalhadasSemana * precoHora) * 4;

        System.out.println( salario);
    }


    @Override
    public void imprimir() {
        System.out.println("Fazendo um recibo digital...");
    }

    @Override
    public void depositar() {
        System.out.println( "Depositando na conta: " + this.getNumeroConta());
    }
}
