public class MotorEletrico extends Motor implements Diagnosticavel {
    public String descricao() { return "Eletrico"; }
    public double custo() { return 200; }
    public String executarDiagnostico() { return "Motor: bateria, inversor, cabos."; }
}