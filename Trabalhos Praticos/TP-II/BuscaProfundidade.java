
public class BuscaProfundidade {

    public static void executar(Grafo grafo, int inicio) {
        boolean[] visitado = new boolean[grafo.getVertices()];

        System.out.println("Busca em Profundidade:");

        dfs(grafo, inicio, visitado);
    }

    private static void dfs(
            Grafo grafo,
            int atual,
            boolean[] visitado
    ) {
        visitado[atual] = true;

        System.out.print(atual + " ");

        for (int vizinho : grafo.getVizinhos(atual)) {

            if (!visitado[vizinho]) {
                dfs(grafo, vizinho, visitado);
            }
        }
    }
}
