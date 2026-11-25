public class DirecaoMecanica extends SistemaDirecao implements Diagnosticavel {
    public String descricao() { return "Mecanica"; }
    public double custo() { return 150; }
    public String executarDiagnostico() { return "Direcao: convergencia, cambagem, torque."; }
}