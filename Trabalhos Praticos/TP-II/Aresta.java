public class Aresta {
    private int destino;
    private double peso;

    public Aresta(int destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public int getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return destino + " (peso: " + peso + ")";
    }
}