import java.util.Scanner;

public class Teste_scan{
    public static void main(String[]args){
        int idade;
        String nome,cep;

        Scanner scan= new Scanner(System.in);

        System.out.println("Digite Seu nome:");
        nome= scan.nextLine();

        System.out.println("Digite sua idade:");
        idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu CEP:");
        cep= scan.nextLine();

        System.out.println("---------------------------------");
        System.out.println ("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("CEP:"+cep);
        System.out.println("---------------------------------");



    }
}