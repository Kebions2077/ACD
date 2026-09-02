public class Assalariado extends Empregado{
    private double salarioAnual;

    public Assalariado (String nome,double salarioAnual){
        this.salarioAnual=salarioAnual;
        setNome(nome);
    }
    @Override

    public double pagamentoSemanal(double horasTrabalhadas){
        return salarioAnual/52;
    }
}