package teste.fatura;

import java.util.Scanner;

public class Item{

    public String nome;
    public float preço;
    public int qnt,id;

    public Item(){
         this.id=0;
         this.nome=null;
         this.preço=0;
         this.qnt=0;
    }
    void adicionar(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o ID do item:");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o nome do Item:");
        this.nome = scan.nextLine();

        System.out.println("Digite a Quantidade do Item:");
        this.qnt = scan.nextInt();

        System.out.println("Digite o preço do Item:");
        this.preço = scan.nextFloat();
    }


}