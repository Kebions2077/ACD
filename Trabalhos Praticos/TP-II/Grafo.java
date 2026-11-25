import java.util.ArrayList;
import java.util.List;

public class Grafo {

    public enum Representacao {
        LISTA,
        MATRIZ
    }

    private int numVertices;
    private boolean dirigido;
    private boolean ponderado;
    private Representacao representacao;

    private List<List<Aresta>> lista;
    private double[][] matriz;

    public Grafo(int numVertices, boolean dirigido, boolean ponderado,
                 Representacao representacao) {

        this.numVertices = numVertices;
        this.dirigido = dirigido;
        this.ponderado = ponderado;
        this.representacao = representacao;

        if (representacao == Representacao.LISTA) {
            lista = new ArrayList<>();

            for (int i = 0; i < numVertices; i++) {
                lista.add(new ArrayList<>());
            }

        } else {
            matriz = new double[numVertices][numVertices];

            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    matriz[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }
    }

    private void validarVertice(int vertice) {
        if (vertice < 0 || vertice >= numVertices) {
            throw new IllegalArgumentException("Vertice invalido: " + vertice);
        }
    }

    public void adicionarAresta(int origem, int destino, double peso) {
        validarVertice(origem);
        validarVertice(destino);

        if (!ponderado) {
            peso = 1;
        }

        if (representacao == Representacao.LISTA) {
            adicionarNaLista(origem, destino, peso);

            if (!dirigido && origem != destino) {
                adicionarNaLista(destino, origem, peso);
            }

        } else {
            matriz[origem][destino] = peso;

            if (!dirigido) {
                matriz[destino][origem] = peso;
            }
        }
    }

    private void adicionarNaLista(int origem, int destino, double peso) {

        lista.get(origem).removeIf(
                aresta -> aresta.getDestino() == destino
        );

        lista.get(origem).add(new Aresta(destino, peso));
    }

    public void removerAresta(int origem, int destino) {
        validarVertice(origem);
        validarVertice(destino);

        if (representacao == Representacao.LISTA) {
            removerDaLista(origem, destino);

            if (!dirigido) {
                removerDaLista(destino, origem);
            }

        } else {
            matriz[origem][destino] = Double.POSITIVE_INFINITY;

            if (!dirigido) {
                matriz[destino][origem] = Double.POSITIVE_INFINITY;
            }
        }
    }

    private void removerDaLista(int origem, int destino) {
        lista.get(origem).removeIf(
                aresta -> aresta.getDestino() == destino
        );
    }

    public List<Aresta> getAdjacentes(int vertice) {
        validarVertice(vertice);

        List<Aresta> adjacentes = new ArrayList<>();

        if (representacao == Representacao.LISTA) {
            adjacentes.addAll(lista.get(vertice));

        } else {
            for (int j = 0; j < numVertices; j++) {
                if (matriz[vertice][j] != Double.POSITIVE_INFINITY) {
                    adjacentes.add(new Aresta(j, matriz[vertice][j]));
                }
            }
        }

        return adjacentes;
    }

    public double getPeso(int origem, int destino) {
        validarVertice(origem);
        validarVertice(destino);

        if (representacao == Representacao.MATRIZ) {
            return matriz[origem][destino];
        }

        for (Aresta aresta : lista.get(origem)) {
            if (aresta.getDestino() == destino) {
                return aresta.getPeso();
            }
        }

        return Double.POSITIVE_INFINITY;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public boolean isPonderado() {
        return ponderado;
    }

    public Representacao getRepresentacao() {
        return representacao;
    }

    public void imprimir() {
        System.out.println("Vertices: " + numVertices);
        System.out.println("Dirigido: " + dirigido);
        System.out.println("Ponderado: " + ponderado);
        System.out.println("Representacao: " + representacao);

        if (representacao == Representacao.LISTA) {
            for (int i = 0; i < numVertices; i++) {
                System.out.print(i + " -> ");

                for (Aresta aresta : lista.get(i)) {
                    System.out.print(aresta + " ");
                }

                System.out.println();
            }

        } else {
            System.out.println("Matriz de adjacencia:");

            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    if (matriz[i][j] == Double.POSITIVE_INFINITY) {
                        System.out.print("INF\t");
                    } else {
                        System.out.print(matriz[i][j] + "\t");
                    }
                }

                System.out.println();
            }
        }
    }
}