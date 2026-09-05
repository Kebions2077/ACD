import java.util.LinkedList;

public class Main{
    public static void main(String [] args){
        LinkedList<Pessoa> contatos= new LinkedList<>();
        contatos.add(new Pessoa("joao","doido","93458345"));
        contatos.add(new Pessoa("louco","joao","93358345"));
System.out.println(contatos.get(0).getNome());
    }
}