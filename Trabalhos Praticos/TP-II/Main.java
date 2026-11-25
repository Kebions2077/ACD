
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Grafo grafo = new GrafoNaoDirecionado(
                5,
                true,
                Grafo.Representacao.LISTA
        );

        grafo.adicionarAresta(0, 1, 10);
        grafo.adicionarAresta(0, 2, 5);
        grafo.adicionarAresta(1, 2, 3);
        grafo.adicionarAresta(1, 3, 7);
        grafo.adicionarAresta(2, 4, 8);
        grafo.adicionarAresta(3, 4, 2);

        System.out.println("GRAFO:");
        grafo.imprimir();

        double[] dijkstra = Dijkstra.executar(grafo, 0);

        double[] bellman = BellmanFord.executar(grafo, 0);

        System.out.println("\nDIJKSTRA:");

        for (double distancia : dijkstra) {
            System.out.println(distancia);
        }

        System.out.println("\nBELLMAN-FORD:");

        for (double distancia : bellman) {
            System.out.println(distancia);
        }


        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("===== TP2 - GRAFOS =====");

            System.out.println("1 - Testar Dijkstra");
            System.out.println("2 - Testar Bellman-Ford");
            System.out.println("3 - Experimento Dijkstra");
            System.out.println("4 - Experimento Bellman-Ford");
            System.out.println("5 - Sair");

            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            try {

                switch (opcao) {

                    case 1:
                        testarAlgoritmo("Dijkstra", scanner);
                        break;

                    case 2:
                        testarAlgoritmo("BellmanFord", scanner);
                        break;

                    case 3:
                        executarExperimento("Dijkstra", scanner);
                        break;

                    case 4:
                        executarExperimento("BellmanFord", scanner);
                        break;

                    case 5:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opcao invalida");
                }

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 5);

        scanner.close();
    }

    private static void testarAlgoritmo(
            String algoritmo,
            Scanner scanner) throws Exception {

        System.out.print("Arquivo .gr: ");

        String arquivo = scanner.next();

        System.out.print("Representacao (1-LISTA / 2-MATRIZ): ");

        int tipo = scanner.nextInt();

        Grafo.Representacao representacao =
                tipo == 1
                        ? Grafo.Representacao.LISTA
                        : Grafo.Representacao.MATRIZ;

        System.out.print("Vertice de origem (começando em 0): ");

        int origem = scanner.nextInt();

        Grafo grafo = GrafoLoader.carregar(
                "RandomGraphSamples/sample500-199600.gr",
                Grafo.Representacao.LISTA
        );

        System.out.println("\nExecutando " + algoritmo);

        double[] resultado;

        if (algoritmo.equals("Dijkstra")) {

            resultado = Dijkstra.executar(grafo, origem);

        } else {

            resultado = BellmanFord.executar(grafo, origem);
        }

        for (int i = 0; i < resultado.length; i++) {

            System.out.println(
                    "Vertice " + i + ": " + resultado[i]
            );
        }
    }

    private static void executarExperimento(
            String algoritmo,
            Scanner scanner) throws Exception {

        System.out.print("Arquivo .gr: ");

        String arquivo = scanner.next();

        System.out.print("Vertice de origem (começando em 0): ");

        int origem = scanner.nextInt();

        System.out.println("1 - Lista de adjacencia");
        System.out.println("2 - Matriz de adjacencia");

        int tipo = scanner.nextInt();

        Grafo.Representacao representacao =
                tipo == 1
                        ? Grafo.Representacao.LISTA
                        : Grafo.Representacao.MATRIZ;

        Experimento.executarConfiguracao(
                arquivo,
                representacao,
                algoritmo,
                origem,
                "resultados/resultados.csv"
        );
    }
}
