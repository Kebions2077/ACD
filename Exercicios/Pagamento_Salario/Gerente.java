public class Gerente extends Assalariado {
    private double bonusSemanal;

    public Gerente(String nome, double salarioAnual, double bonusSemanal) {
        super(nome, salarioAnual);
        this.bonusSemanal = bonusSemanal;
    }

    @Override
    public double pagamentoSemanal(double horasTrabalhadas) {
        return super.pagamentoSemanal(horasTrabalhadas) + bonusSemanal;
    }
}