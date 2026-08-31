package teste.fatura;

import java.util.Scanner;

public class Cliente{
    private String nome,celular;
    private int idade;
    private boolean status;

    public Cliente(){
        this.nome= null;
        this.idade= 0;
        this.celular= null;
        this.status= true;
    }
    void cadastro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------Cadastro de Cliente-------------");

        System.out.println("Digite o nome do cliente:");
        this.nome = scan.nextLine();

        System.out.println("Digite o celular do cliente:");
        this.celular = scan.nextLine();

        System.out.println("Digite a idade do cliente:");
        this.idade = scan.nextInt();

    }
    void fechar_conta(){
        if(this.status==true){
            this.status= false;
            System.out.println("Encerrando Conta!!!");}
        else{
            System.out.println("A conta ja está encerrada!");
        }

    }

}





