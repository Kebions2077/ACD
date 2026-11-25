
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrafoLoader {

    public static Grafo carregar(
            String caminho,
            Grafo.Representacao representacao) throws IOException {

        int numVertices = 0;

        Grafo grafo = null;

        try (BufferedReader leitor = new BufferedReader(
                new FileReader(caminho))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {

                linha = linha.trim();

                if (linha.isEmpty() || linha.startsWith("c")) {
                    continue;
                }

                String[] partes = linha.split("\\s+");

                if (partes[0].equals("p")) {

                    numVertices = Integer.parseInt(partes[2]);

                    grafo = new Digrafo(
                            numVertices,
                            true,
                            representacao
                    );

                } else if (partes[0].equals("a")) {

                    if (grafo == null) {
                        throw new IOException(
                                "Cabecalho do grafo nao encontrado"
                        );
                    }

                    int origem = Integer.parseInt(partes[1]) - 1;

                    int destino = Integer.parseInt(partes[2]) - 1;

                    double peso = Double.parseDouble(partes[3]);

                    grafo.adicionarAresta(origem, destino, peso);
                }
            }
        }

        if (grafo == null) {
            throw new IOException("Arquivo de grafo invalido");
        }

        return grafo;
    }
}
