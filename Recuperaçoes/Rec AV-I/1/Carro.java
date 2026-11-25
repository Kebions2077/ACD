public class Carro extends Veiculo {
    Motor motor;
    SistemaDirecao direcao;

    public Carro(String renavam, int ano, Motor m, SistemaDirecao d) {
        super(renavam, ano);
        this.motor = m;
        this.direcao = d;
    }

    public double calcularCustoManutencao() {
        return 100 + motor.custo() + direcao.custo();
    }

    public String toString() {
        return renavam + "/" + ano + " [" + motor.descricao() + " + " + direcao.descricao() + "]";
    }
}