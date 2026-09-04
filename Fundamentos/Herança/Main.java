import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, whip;
        op = whip = 0;
        Humano h1 = null;
        Gato g1 = null;

        Scanner scan = new Scanner(System.in);
        while (whip != 3) {

            System.out.println("--------------------------------");
            System.out.println("1)Criar Humano");
            System.out.println("2)Criar Gato");
            System.out.println("3)Ver Mamiferos e sair");
            System.out.println("-----------------------------");
            System.out.println("Digite a opçao:");

            op = scan.nextInt();
            scan.nextLine();

            switch (op) {

                default:
                    System.out.println("Opçao invalida");
                    break;

                case 1:

                    System.out.println("Digite o Nome:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o sobrenome:");
                    String sobrenome = scan.nextLine();
                    System.out.println("Digite o peso");
                    float peso = scan.nextFloat();
                    System.out.println("Digite a idade:");
                    int idade = scan.nextInt();
                    h1 = new Humano(nome, sobrenome, peso, idade);
                    break;

                case 2:

                    System.out.println("Digite a raça:");
                    String g_raça = scan.nextLine();
                    System.out.println("Digite o nome:");
                    String g_nome = scan.nextLine();
                    System.out.println("Digite o peso");
                    float g_peso = scan.nextFloat();
                    System.out.println("Digite a idade:");
                    int g_idade = scan.nextInt();
                    g1 = new Gato(g_raça, g_idade, g_peso, g_nome);
                    break;

                case 3:

                    System.out.println("------------------------------------");
                    System.out.println("---------------Gato---------------");
                    System.out.println("Raça:" + g1.getRaça());
                    System.out.println("Nome:" + g1.getNome());
                    System.out.println("Peso:" + g1.getPeso());
                    System.out.println("Idade:" + g1.getIdade());
                    System.out.println("----------------------------------");

                    System.out.println("------------------------------------");
                    System.out.println("---------------Humano---------------");
                    System.out.println("Nome:" + h1.getNome());
                    System.out.println("Sobreome:" + h1.getSobrenome());
                    System.out.println("Peso:" + h1.getPeso());
                    System.out.println("Idade:" + g1.getIdade());
                    System.out.println("----------------------------------");
                    return;
            }
        }
    }
}