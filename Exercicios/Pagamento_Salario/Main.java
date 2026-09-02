import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        int op;

        System.out.println("===================================");
        System.out.println("--------- Calculo Salario ---------");
        System.out.println("1) Horista");
        System.out.println("2) Assalariado");
        System.out.println("3) Gerente");
        System.out.println("===================================");

        System.out.println("\n--------------------------------");
        System.out.println("Digite o tipo de empregado:");
        System.out.println("--------------------------------");

        op = sc1.nextInt();

        switch (op) {

            case 1:
                System.out.println("\n--- HORISTA ---");

                System.out.println("Digite o nome:");
                String nomeH = sc1.next();

                System.out.println("Digite o salario por hora:");
                double salarioH = sc1.nextDouble();

                System.out.println("Digite as horas trabalhadas:");
                double horas = sc1.nextDouble();

                Horista h1 = new Horista(nomeH, salarioH);

                System.out.println("\nEmpregado: " + h1.getNome());
                System.out.println("Pagamento semanal: R$ "
                        + h1.pagamentoSemanal(horas));

                break;

            case 2:
                System.out.println("\n--- ASSALARIADO ---");

                System.out.println("Digite o nome:");
                String nomeA = sc1.next();

                System.out.println("Digite o salario anual:");
                double salarioA = sc1.nextDouble();

                Assalariado a1 = new Assalariado(nomeA, salarioA);

                System.out.println("\nEmpregado: " + a1.getNome());
                System.out.println("Pagamento semanal: R$ "
                        + a1.pagamentoSemanal(0));

                break;

            case 3:
                System.out.println("\n--- GERENTE ---");

                System.out.println("Digite o nome:");
                String nomeG = sc1.next();

                System.out.println("Digite o salario anual:");
                double salarioG = sc1.nextDouble();

                System.out.println("Digite o bonus semanal:");
                double bonus = sc1.nextDouble();

                Gerente g1 = new Gerente(nomeG, salarioG, bonus);

                System.out.println("\nGerente: " + g1.getNome());
                System.out.println("Pagamento semanal: R$ "
                        + g1.pagamentoSemanal(0));

                break;

            default:
                System.out.println("Opcao invalida!");
                break;
        }

        sc1.close();
    }
}