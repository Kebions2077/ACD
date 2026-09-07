import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;


        Carro carro = new Carro(0, 180, false, "dsfgaggrg", "vrumvrumpoo");
        Scanner scan = new Scanner(System.in);

        while (op != 5) {
            System.out.println("===============Carro POO===============");
            System.out.println("Carro: " + carro.getModelo());
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Velocidade atual: " + carro.getVelocidade());
            System.out.println("1) Status");
            System.out.println("2) Ligar");
            System.out.println("3) Parar");
            System.out.println("4) Acelerar ao máximo");
            System.out.println("5) Sair Do Programa");
            System.out.println("=======================================");
            System.out.print("Digite a ação para o veículo realizar: ");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    carro.status();
                    break;

                case 2:
                    carro.ligar();
                    break;

                case 3:
                    carro.parar();
                    break;

                case 4:
                    carro.acelerar_max();
                    break;

                case 5:
                    System.out.println("Saindo Do Programa");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            System.out.println();
        }

        scan.close();
    }
}