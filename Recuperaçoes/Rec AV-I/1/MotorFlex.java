public class MotorFlex extends Motor implements Diagnosticavel {
    public String descricao() { return "Flex"; }
    public double custo() { return 350; }
    public String executarDiagnostico() { return "Motor: oleo, arrefecimento, filtros."; }
}