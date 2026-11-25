
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

    private static class Estado {
        int vertice;
        double distancia;

        Estado(int vertice, double distancia) {
            this.vertice = vertice;
            this.distancia = distancia;
        }
    }

    public static double[] executar(Grafo grafo, int origem) {

        if (origem < 0 || origem >= grafo.getNumVertices()) {
            throw new IllegalArgumentException("Origem invalida");
        }

        int n = grafo.getNumVertices();

        double[] distancias = new double[n];

        Arrays.fill(distancias, Double.POSITIVE_INFINITY);

        boolean[] visitados = new boolean[n];

        PriorityQueue<Estado> fila = new PriorityQueue<>(
                (a, b) -> Double.compare(a.distancia, b.distancia)
        );

        distancias[origem] = 0;

        fila.add(new Estado(origem, 0));

        while (!fila.isEmpty()) {

            Estado atual = fila.poll();

            int u = atual.vertice;

            if (visitados[u]) {
                continue;
            }

            visitados[u] = true;

            for (Aresta aresta : grafo.getAdjacentes(u)) {

                int v = aresta.getDestino();

                double peso = aresta.getPeso();

                if (peso < 0) {
                    throw new IllegalArgumentException(
                            "Dijkstra nao aceita pesos negativos"
                    );
                }

                double novaDistancia = distancias[u] + peso;

                if (novaDistancia < distancias[v]) {

                    distancias[v] = novaDistancia;

                    fila.add(new Estado(v, novaDistancia));
                }
            }
        }

        return distancias;
    }
}
