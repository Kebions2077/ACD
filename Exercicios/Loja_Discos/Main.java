Aqui está o código **sem comentários**:

        ```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cd cd = null;
        Vinyl vinyl = null;
        int op = 0;

        while (op != 4) {
            System.out.println("----------------------------");
            System.out.println("---------Cadastro-----------");
            System.out.println("1) Cd");
            System.out.println("2) Vinyl");
            System.out.println("3) Mostrar Base de Dados");
            System.out.println("4) Sair");
            System.out.println("----------------------------");
            System.out.print("Digite a opção: ");

            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Artista: ");
                    String artista = scan.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scan.nextLine();

                    System.out.print("ID: ");
                    int id = scan.nextInt();

                    System.out.print("Ano: ");
                    int ano = scan.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidade = scan.nextInt();

                    System.out.print("Preço: ");
                    float preco = scan.nextFloat();

                    System.out.print("Duração (minutos): ");
                    float duracao = scan.nextFloat();
                    scan.nextLine();

                    System.out.print("Mixagem (DDD, ADD, AAC): ");
                    String mixagemStr = scan.nextLine().toUpperCase();
                    Mixagem mixagem = Mixagem.valueOf(mixagemStr);

                    cd = new Cd(nome, artista, genero, id, ano, quantidade,
                            preco, duracao, mixagem);

                    System.out.println("CD cadastrado com sucesso!!\n");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomev = scan.nextLine();

                    System.out.print("Artista: ");
                    String artistav = scan.nextLine();

                    System.out.print("Gênero: ");
                    String generov = scan.nextLine();

                    System.out.print("Tamanho (7, 10 ou 12 polegadas): ");
                    String tamv = scan.nextLine();

                    System.out.print("ID: ");
                    int idv = scan.nextInt();

                    System.out.print("Ano: ");
                    int anov = scan.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidadev = scan.nextInt();

                    System.out.print("RPM (33, 45 ou 78): ");
                    int RPMv = scan.nextInt();

                    System.out.print("Preço: ");
                    float precov = scan.nextFloat();

                    System.out.print("Duração (minutos): ");
                    float duracaov = scan.nextFloat();
                    scan.nextLine();

                    System.out.print("Especificação (DUPLO, COMPACTO, REMASTERIZADO): ");
                    String especStr = scan.nextLine().toUpperCase();
                    Especificacao espec = Especificacao.valueOf(especStr);

                    vinyl = new Vinyl(nomev, artistav, generov, tamv,
                            idv, anov, quantidadev, RPMv,
                            precov, duracaov, espec);

                    System.out.println("Vinyl cadastrado com sucesso!!\n");
                    break;

                case 3:
                    System.out.println("\n========== BASE DE DADOS ==========");

                    if (cd != null) {
                        System.out.println("\n--- CD CADASTRADO ---");
                        System.out.println("Nome: " + cd.getNome());
                        System.out.println("Artista: " + cd.getArtista());
                        System.out.println("Gênero: " + cd.getGenero());
                        System.out.println("ID: " + cd.getId());
                        System.out.println("Ano: " + cd.getAno());
                        System.out.println("Quantidade: " + cd.getQuantidade());
                        System.out.println("Preço: R$" + String.format("%.2f", cd.getPreco()));
                        System.out.println("Duração: " + cd.getDuracao() + " min");
                        System.out.println("Mixagem: " + cd.getMixagem());
                    } else {
                        System.out.println("\nNenhum CD cadastrado!");
                    }

                    if (vinyl != null) {
                        System.out.println("\n--- VINYL CADASTRADO ---");
                        System.out.println("Nome: " + vinyl.getNome());
                        System.out.println("Artista: " + vinyl.getArtista());
                        System.out.println("Gênero: " + vinyl.getGenero());
                        System.out.println("ID: " + vinyl.getId());
                        System.out.println("Ano: " + vinyl.getAno());
                        System.out.println("Quantidade: " + vinyl.getQuantidade());
                        System.out.println("Preço: R$" + String.format("%.2f", vinyl.getPreco()));
                        System.out.println("Duração: " + vinyl.getDuracao() + " min");
                        System.out.println("Tamanho: " + vinyl.getTamanho() + "\"");
                        System.out.println("RPM: " + vinyl.getRpm() + " RPM");
                    } else {
                        System.out.println("\nNenhum Vinyl cadastrado!");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scan.close();
    }
}


