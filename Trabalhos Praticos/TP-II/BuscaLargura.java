
import java.util.*;

public class BuscaLargura {

    public static void executar(Grafo grafo, int inicio) {
        int vertices = grafo.getVertices();

        boolean[] visitado = new boolean[vertices];

        Queue<Integer> fila = new LinkedList<>();

        visitado[inicio] = true;
        fila.add(inicio);

        System.out.println("Busca em Largura:");

        while (!fila.isEmpty()) {
            int atual = fila.poll();

            System.out.print(atual + " ");

            for (int vizinho : grafo.getVizinhos(atual)) {

                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }
    }
}
