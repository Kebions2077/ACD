import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("111AAA", 2020, new MotorFlex(), new DirecaoMecanica());
        Carro c2 = new Carro("222BBB", 2023, new MotorEletrico(), new DirecaoEletrica());

        // Polimorfismo via Veiculo
        Veiculo v = c1;
        System.out.println(v + " custo=" + v.calcularCustoManutencao());

        // Polimorfismo via interface
        Diagnosticavel d = (Diagnosticavel) c1.motor;
        System.out.println(d.executarDiagnostico());

        // compareTo
        System.out.println("c1 vs c2 = " + c1.compareTo(c2));
        System.out.println("c2 vs c1 = " + c2.compareTo(c1));

        // Ordenação simples
        Carro[] carros = {c2, c1};
        Arrays.sort(carros);
        System.out.println("Ordenados: " + Arrays.toString(carros));
    }
}