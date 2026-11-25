
import java.util.Arrays;
import java.util.List;

public class BellmanFord {

    public static double[] executar(Grafo grafo, int origem) {

        if (origem < 0 || origem >= grafo.getNumVertices()) {
            throw new IllegalArgumentException("Origem invalida");
        }

        int n = grafo.getNumVertices();

        double[] distancias = new double[n];

        Arrays.fill(distancias, Double.POSITIVE_INFINITY);

        distancias[origem] = 0;

        for (int i = 0; i < n - 1; i++) {

            boolean alterou = false;

            for (int u = 0; u < n; u++) {

                if (distancias[u] == Double.POSITIVE_INFINITY) {
                    continue;
                }

                List<Aresta> adjacentes = grafo.getAdjacentes(u);

                for (Aresta aresta : adjacentes) {

                    int v = aresta.getDestino();

                    double peso = aresta.getPeso();

                    double novaDistancia = distancias[u] + peso;

                    if (novaDistancia < distancias[v]) {

                        distancias[v] = novaDistancia;

                        alterou = true;
                    }
                }
            }

            if (!alterou) {
                break;
            }
        }

        for (int u = 0; u < n; u++) {

            if (distancias[u] == Double.POSITIVE_INFINITY) {
                continue;
            }

            for (Aresta aresta : grafo.getAdjacentes(u)) {

                int v = aresta.getDestino();

                double peso = aresta.getPeso();

                if (distancias[u] + peso < distancias[v]) {

                    throw new IllegalStateException(
                            "O grafo possui ciclo negativo alcancavel"
                    );
                }
            }
        }

        return distancias;
    }
}
