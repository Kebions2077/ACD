public abstract class Veiculo implements Comparable<Veiculo> {
    String renavam;
    int ano;

    Veiculo(String renavam, int ano) {
        this.renavam = renavam;
        this.ano = ano;
    }

    public abstract double calcularCustoManutencao();

    public int compareTo(Veiculo o) {
        if (ano != o.ano) return ano - o.ano;
        return renavam.compareTo(o.renavam);
    }

    public String toString() {
        return renavam + "/" + ano;
    }
}