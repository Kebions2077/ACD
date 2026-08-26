import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int op=0;

        Veiculo v1 = new Veiculo();
        Scanner scan= new Scanner(System.in);

        while (op !=5){
            System.out.println("===============Carro POO===============");
            System.out.println("1)Status");
            System.out.println("2)ligar)");
            System.out.println("3)Parar");
            System.out.println("4)Acelerar ao maximo");
            System.out.println("5)Sair Do Programa");
            System.out.println("=======================================");
            System.out.println("Digite a ação para o veiculo realizar:");

            op= scan.nextInt();

            switch(op){

                default:
                    System.out.println("Opção Invalida");
                    break;

                case 1:
                    v1.status();
                    break;

                case 2:
                    v1.ligar();
                    break;

                case 3:
                    v1.parar();
                    break;

                case 4:
                    v1.acelerar_max();
                    break;

                case 5:
                    System.out.println("Saindo Do Programa");
                    return;

            }


            scan.close();

        }
    }
}

