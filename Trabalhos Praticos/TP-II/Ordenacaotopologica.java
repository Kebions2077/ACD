
import java.util.*;

public class OrdenacaoTopologica {

    public static void executar(Grafo grafo) {

        int vertices = grafo.getVertices();

        int[] grauEntrada = new int[vertices];

        // Calcula o grau de entrada
        for (int i = 0; i < vertices; i++) {
            for (int vizinho : grafo.getVizinhos(i)) {
                grauEntrada[vizinho]++;
            }
        }

        Queue<Integer> fila = new LinkedList<>();

        // Adiciona os vértices sem dependências
        for (int i = 0; i < vertices; i++) {
            if (grauEntrada[i] == 0) {
                fila.add(i);
            }
        }

        int contador = 0;

        System.out.println("Ordenacao Topologica:");

        while (!fila.isEmpty()) {

            int atual = fila.poll();

            System.out.print(atual + " ");
            contador++;

            for (int vizinho : grafo.getVizinhos(atual)) {

                grauEntrada[vizinho]--;

                if (grauEntrada[vizinho] == 0) {
                    fila.add(vizinho);
                }
            }
        }

        if (contador != vertices) {
            System.out.println("\nO grafo possui ciclo!");
        }
    }
}
