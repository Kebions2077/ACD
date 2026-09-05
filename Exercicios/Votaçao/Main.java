import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int op,votos_a,votos_b,votos_c,votos_branco;
        Urna u1= new Urna(0,0,0,0);
        Scanner scan=new Scanner(System.in);

        System.out.println("---------Votaçao---------");
        System.out.println("1)A");
        System.out.println("2)B");
        System.out.println("3)C");
        System.out.println("4)Branco");
        System.out.println("5)Apurar");
        System.out.println("6)Sair");
        System.out.println("------------------------");
        System.out.println("Vote:");
        op=scan.nextInt();

        switch(op){
            default:
                System.out.println("Candidato invalido");
                break;

            case 1:
                u1.votar_A();
                break;

            case 2:
                u1.votar_B();
                break;

            case 3:
                u1.votar_C();
                break;

            case 4:
                u1.votar_Branco();
                break;

            case 5:
                u1.apurar();
                break;

            case 6:
                return;
        }
    }

}

