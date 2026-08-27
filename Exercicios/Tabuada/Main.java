import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
        int numero;
        Scanner scan= new Scanner(System.in);
        Tabuada t1 = new Tabuada();
        System.out.println("Digite o numero para a tabuada:");
        numero = scan.nextInt();
        t1.calcular(numero);
        return;

}
}
