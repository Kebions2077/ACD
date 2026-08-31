package teste.fatura;

import java.util.Scanner;

public class Item{

    private int id;
    private String nome;
    private float preço;
    private int qnt;

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

    public int getId(){return id;}
    public String getNome{return nome;}
    public float getPreço{return preço;}
    public int getQnt{ return qnt;}

}