package teste.fatura;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Cliente c1 = new Cliente();
        Fatura fa1 = new Fatura();
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> itens = new ArrayList<>();

        c1.cadastro();

        while (op != 4) {
            System.out.println("---------------------------------------");
            System.out.println("1-Adicionar Item");
            System.out.println("2-Vizualizar Fatura");
            System.out.println("3-Pagar Fatura");
            System.out.println("4-Sair");
            System.out.println("---------------------------------------");

            System.out.println("Digite sua opção:");
            op = scan.nextInt();
            scan.nextLine();

            switch(op){
                case 1:
                    System.out.println("----------Adicionar Item------------");
                    Item novoItem = new Item();
                    novoItem.adicionar();
                    itens.add(novoItem);
                    fa1.adicionarItem(novoItem);
                    break;

                case 2:
                    fa1.resumo();
                    break;

                case 3:
                    System.out.println("Digite o valor do pagamento:");
                    float pagamento = scan.nextFloat();
                    fa1.pagar_fatura(pagamento);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        scan.close();
    }
}