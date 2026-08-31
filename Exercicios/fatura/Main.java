package teste.fatura;

import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        int op;
        Cliente c1 = new Cliente();
        Fatura fa1 = new Fatura();
        Scanner scan= new Scanner(System.in);

        Cliente.cadastro();



        while (op != 4) {

            int n_item;
            n_item=0;
            n_item+1;

            System.out.println("---------------------------------------");
            System.out.println("1-Adicionar Item");
            System.out.println("2-Vizualizar Fatura");
            System.out.println("3-Pagar Fatura");
            System.out.println("4-Sair");
            System.out.println("---------------------------------------");

            System.out.println("Digite sua opçao:");
            scan.nextInt();

                switch(op){

                    default: System.out.println("Opçao Invalida");
                    break;

                    case 1:
                        System.out.println("----------Adicionar Item------------");



            }
        }
    }
}