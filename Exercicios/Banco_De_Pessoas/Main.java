import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    LinkedList<Pessoa> banco= new LinkedList<>();
    Scanner scan= new Scanner(System.in);
    int op=0;
    while(op!=5){
    System.out.println("-----------Menu--------");
    System.out.println("1)Cadastrar Pessoa");
    System.out.println("2)Listar Pessoas");
    System.out.println("3)Buscar Pelo Nome");
    System.out.println("4)Remover Pelo Nome");
    System.out.println("5)Sair");
    System.out.println("------------------------");
    System.out.println("Digite Uma Opçao:");
    op=scan.nextInt();
        scan.nextLine();
    switch(op){
        default:
            System.out.println("Opçao invalida");
            break;

        case 1:
            System.out.println("Digite Nome:");
            String tempnome= scan.nextLine();

            System.out.println("Digite CPF");
            String tempCPF= scan.nextLine();

            System.out.println("Digite idade:");
            int tempidade= scan.nextInt();
            scan.nextLine();
            Pessoa p= new Pessoa(tempnome,tempCPF,tempidade);
            banco.add(p);
            break;

        case 2:
            System.out.println(banco);
            break;

        case 3:
            String nome_busca;
            boolean encontrado=false;
            System.out.println("Digite o nome para fazer a busca:");
            nome_busca= scan.nextLine();

            for( Pessoa pessoa : banco){
                if(pessoa.getNome().equals(nome_busca)){
                    System.out.println(pessoa);
                    encontrado=true;
                }

                }
            if(!encontrado){
                System.out.println("Pessoa nao encontrada");
        }
            break;

        case 4:
            String apagar_nome;
            boolean nom_apag=false;

            System.out.println("Digite o nome para fazer a busca para apagar:");
            apagar_nome=scan.nextLine();

            for(Pessoa pessoa : banco){
                if(pessoa.getNome().equals(apagar_nome)){
                    banco.remove(pessoa);
                    nom_apag=false;
                }
            }
            if(!encontrado){
                System.out.println("Pessoa nao econtrada");
            }
            break;

        case 5:
            return;
            break;
            }
    }

    }
}
